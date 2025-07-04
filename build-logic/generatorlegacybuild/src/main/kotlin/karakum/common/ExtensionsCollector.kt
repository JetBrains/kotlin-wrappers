package karakum.common

private const val CONTROLLER = "controller"

private val ABORTABLE_TYPES = setOf(
    "AddEventListenerOptions",
    "CredentialCreationOptions",
    "CredentialRequestOptions",
    "StreamPipeOptions",
    "SubscribeOptions",
    "RequestInit",
    "LockOptions",
)

interface ExtensionsCollector {
    fun add(
        functionName: String,
        functionSignature: String,
        parameters: String,
        returnType: String,
        optionalPromise: Boolean,
        docs: String?,
    )

    fun getResult(): String
}

// Example: "name: String, age: Int" -> listOf("name", "age")
private fun parseParameterNames(parameters: String): List<String> {
    require("(" in parameters) { parameters }
    return parameters
        .substringAfter("(")
        .split(",")
        .filter { ":" in it }
        .map { it.substringBefore(":") }
}

// Example: "name: String, age: Int" -> "Int"
private fun parseLastParameterType(parameters: String): String? {
    if (":" !in parameters) return null
    return parameters
        .substringAfterLast(":")
        .substringBefore(")")
        .trim()
}

// Example: "T : JsAny?, W : JsString" -> listOf("T", "W")
private fun parseTypeParametersNames(typeParameters: String): List<String> {
    return typeParameters
        .split(",")
        .map { it.substringBefore(":").trim() }
}

internal open class SuspendExtensionsCollector(
    val parentName: String,
    val parentTypeParameters: String?,
) : ExtensionsCollector {

    init {
        require(parentTypeParameters?.startsWith("<")?.not() ?: true) {
            "Type parameters should be extracted before: $parentTypeParameters"
        }
    }

    private val extensions = mutableListOf<String>()

    override fun getResult(): String {
        return extensions.joinToString("\n\n")
    }

    override fun add(
        functionName: String,
        functionSignature: String,
        parameters: String,
        returnType: String,
        optionalPromise: Boolean,
        docs: String?,
    ) {
        require(returnType.isEmpty() || returnType.startsWith(":")) {
            "Return type should start with colon: $returnType in $parentName.$functionName"
        }
        require("<" !in functionSignature || parentTypeParameters == null) {
            "Can't generate extension with parent type parameters and own generics."
        }

        val functionParameters = parseParameterNames(parameters)
        val lastParameterType = parseLastParameterType(parameters)
        val isAbortable = lastParameterType?.let { it in ABORTABLE_TYPES } == true

        val callParameters = functionParameters.mapIndexed { index, param ->
            if (index == functionParameters.lastIndex && isAbortable) {
                "patchAbortOptions($param, $CONTROLLER)"
            } else param
        }.joinToString(", ")
        val promiseCall = "${functionName}Async($callParameters)"

        val resultCast = when (returnType) {
            ": Boolean" -> ".toBoolean()"
            ": String" -> ".toString()"
            ": Int" -> ".toInt()"
            else -> ""
        }
        val returnKeyword = when {
            (returnType.isEmpty() || returnType.contains(": Unit")) -> ""
            else -> "return "
        }

        val body = when {
            isAbortable -> """
                val $CONTROLLER = AbortController()
                ${returnKeyword}awaitPromiseLike($promiseCall, $CONTROLLER)$resultCast
            """.trimIndent()

            optionalPromise -> "${returnKeyword}awaitOptionalPromiseLike($promiseCall)$resultCast"
            else -> "${returnKeyword}awaitPromiseLike($promiseCall)$resultCast"
        }
        val comment = docs?.let { "$it\n" }.orEmpty()

        val funTypeParameters = parentTypeParameters?.let { "<$it>" }.orEmpty()
        val parentGenerics = parentTypeParameters
            ?.let { parseTypeParametersNames(it) }
            ?.joinToString(",")
            ?.let { "<$it>" }
            .orEmpty()

        var newParameters = parameters
        functionParameters.filter { it.contains("callback", ignoreCase = true) }.forEach {
            newParameters = newParameters.replace(it, "noinline $it")
        }

        val extension = """
        ${comment}suspend inline $functionSignature $funTypeParameters $parentName$parentGenerics.$functionName$newParameters$returnType {
            $body
        }
        """.trimIndent()

        extensions.add(extension)
    }
}
