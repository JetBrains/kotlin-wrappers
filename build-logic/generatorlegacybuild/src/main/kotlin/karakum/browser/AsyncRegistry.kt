package karakum.browser

private fun parseParamsNames(params: String): List<String> {
    require("(" in params) { params }
    return params
        .substringAfter("(")
        .split(",")
        .filter { ":" in it }
        .map { it.substringBefore(":") }
}

private fun parseLastParamType(params: String): String? {
    if (":" !in params) return null
    return params
        .substringAfterLast(":")
        .substringBefore(")")
        .replace("= definedExternally", "")
        .trim()
}

private fun extractGenerics(typesParams: String): List<String> {
    return typesParams
        .split(",")
        .map { it.substringBefore(":").trim() }
}

private const val CONTROLLER = "controller"

internal data class AsyncMember(
    val name: String,
    val funSignature: String,
    val parameters: String,
    val returnType: String,
    val optional: Boolean,
    val docs: String?,
) {
    fun suspendExtension(parentType: String, typeParameters: String?): String {
        val funParams = parseParamsNames(parameters)
        val lastParamType = parseLastParamType(parameters)
        val isAbortable = lastParamType?.let {
            AsyncRegistry.isAbortable(it)
        } == true

        val callParams = funParams.mapIndexed { index, param ->
            if (index == funParams.lastIndex && isAbortable) {
                "patchAbortOptions($param, $CONTROLLER)"
            } else param
        }.joinToString(", ")
        val promiseCall = "${name}Async($callParams)"

        val rt = if (returnType.isEmpty() || returnType.contains(": Unit")) "" else "return "
        val body = when {
            isAbortable -> """
                val $CONTROLLER = AbortController()
                ${rt}awaitPromiseLike($promiseCall, $CONTROLLER)
            """.trimIndent()

            optional -> "${rt}awaitOptionalPromiseLike($promiseCall)"
            else -> "${rt}awaitPromiseLike($promiseCall)"
        }
        val doc = docs?.let { "$it\n" }.orEmpty()

        val typeParams = typeParameters?.let { "<$it>" }.orEmpty()
        val parentGenerics = typeParameters
            ?.let { extractGenerics(it) }
            ?.joinToString(",")
            ?.let { "<$it>" }
            .orEmpty()

        var params = parameters
        funParams.filter { it.contains("callback", ignoreCase = true) }.forEach {
            params = params.replace(it, "noinline $it")
        }

        val returnJsType = returnType
            .replace(": Unit", "")
            .replace("String", "JsString")
            .replace("Boolean", "JsBoolean")
            .replace("Int", "JsInt")

        val extension = """
        ${doc}suspend inline $funSignature $typeParams $parentType$parentGenerics.$name$params$returnJsType {
            $body
        }
        """.trimIndent()

        return when {
            parentType == "CustomElementRegistry"
                -> extension.replace(
                "CustomElementRegistry.whenDefined(name: String): CustomElementConstructor",
                "<T : HTMLElement> CustomElementRegistry.whenDefined(name: TagName<T>): CustomElementConstructor<T>"
            )

            else -> extension
        }
    }
}

internal object AsyncRegistry {
    private val abortableTypes = mutableSetOf<String>()
    private val asyncMembers = mutableMapOf<String, MutableList<AsyncMember>>()

    fun isAbortable(typeName: String): Boolean {
        return typeName in abortableTypes
    }

    fun registerAbortableType(typeName: String) {
        if (typeName in abortableTypes) {
            println("Type $typeName is already registered")
            return
        }
        abortableTypes.add(typeName)
    }

    fun registerAsyncMember(forName: String, member: AsyncMember) {
        val existingMembers = asyncMembers.getOrPut(forName) { mutableListOf() }
        existingMembers.add(member)
    }

    fun generateSuspendExtensions(forName: String, typeParams: String?): String {
        val members = asyncMembers.remove(forName) ?: return ""
        return members.joinToString("\n\n") {
            it.suspendExtension(forName, typeParams)
        }
    }
}
