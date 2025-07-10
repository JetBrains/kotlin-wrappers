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

// Example: "(name: String, age: Int)" -> listOf("name", "age")
private fun parseParameterNames(parameters: String): List<String> {
    require("(" in parameters) { parameters }
    return parameters
        .substringAfter("(")
        .split(",")
        .filter { ":" in it }
        .map { it.substringBefore(":").trim() }
}

// Example: "(name: String, age: Int)" -> "Int"
private fun parseLastParameterType(parameters: String): String? {
    if (":" !in parameters) return null
    return parameters
        .substringAfterLast(":")
        .substringBefore(")")
        .replace(DEFINED_EXTERNALLY, "")
        .replace(",", "")
        .trim()
}

// Example: "T : JsAny?, W : JsString" -> listOf("T", "W")
private fun parseTypeParametersNames(typeParameters: String): List<String> {
    return typeParameters
        .split(",")
        .map { it.substringBefore(":").trim() }
}

// Example: "(name: String, age: Int = definedExternally)" -> listOf("name: String", "age: Int")
private fun splitParameters(parameters: String): List<String> {
    return parameters
        .slice(1 until parameters.length - 1)
        .replace(DEFINED_EXTERNALLY, "")
        .split(",")
        .filter { it.isNotBlank() }
}

private fun String.withNoInline(parameterNames: List<String>): String {
    var newParameters = this
    parameterNames
        .filter { it.contains("callback", ignoreCase = true) }
        .forEach { newParameters = newParameters.replace(it, "noinline $it") }
    return newParameters
}

private const val DEFINED_EXTERNALLY = "= definedExternally"

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

    val parentGenerics by lazy {
        parentTypeParameters
            ?.let { parseTypeParametersNames(it) }
            ?.joinToString(",")
            ?.let { "<$it>" }
            .orEmpty()
    }

    private fun generateSuspendBody(
        functionName: String,
        parameterNames: List<String>,
        parametersToSkip: Int,
        returnType: String,
        optionalPromise: Boolean,
        isAbortable: Boolean,
    ): String {
        val argumentNames = parameterNames.subList(0, parameterNames.size - parametersToSkip)
        var arguments = argumentNames.mapIndexed { i, arg ->
            if (i == parameterNames.lastIndex && isAbortable) {
                "$arg = patchAbortOptions($arg, $CONTROLLER)"
            } else "$arg = $arg"
        }.joinToString(",\n")

        if (isAbortable && parametersToSkip > 0) {
            val comma = ",\n".takeIf { arguments.isNotEmpty() }.orEmpty()
            arguments += "$comma${parameterNames.last()} = createAbortable($CONTROLLER.signal)\n"
        }

        val promiseCall = "${functionName}Async($arguments)"
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

        return when {
            isAbortable -> """
                val $CONTROLLER = AbortController()
                ${returnKeyword}awaitPromiseLike($promiseCall, $CONTROLLER)$resultCast
            """.trimIndent()

            optionalPromise -> "${returnKeyword}awaitOptionalPromiseLike($promiseCall)$resultCast"
            else -> "${returnKeyword}awaitPromiseLike($promiseCall)$resultCast"
        }
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

        val lastParameterType = parseLastParameterType(parameters)
        val isAbortable = lastParameterType?.let { it in ABORTABLE_TYPES } == true
        val externallyDefinedParametersCount = parameters.count(DEFINED_EXTERNALLY)

        val parameterNames = parseParameterNames(parameters)
        val parametersList = splitParameters(parameters)

        // Generate many extensions if there are externally defined parameters
        for (parametersToSkip in 0..externallyDefinedParametersCount) {
            val comment = docs?.let { "$it\n" }.orEmpty()
            val funTypeParameters = parentTypeParameters?.let { "<$it>" }.orEmpty()
            val parametersSlice = parametersList.subList(0, parametersList.size - parametersToSkip)
            val newParameters = "(${parametersSlice.joinToString(",")})".withNoInline(parameterNames)
            val body = generateSuspendBody(
                functionName,
                parameterNames,
                parametersToSkip,
                returnType,
                optionalPromise,
                isAbortable
            )

            val extension = """
            ${comment}suspend inline $functionSignature $funTypeParameters $parentName$parentGenerics.$functionName$newParameters$returnType {
                $body
            }
            """.trimIndent()
            extensions.add(extension)
        }
    }
}
