package karakum.common

private const val CONTROLLER = "controller"
private const val CONTROLLER_INIT = "val $CONTROLLER = AbortController()"

private val ABORTABLE_TYPES = setOf(
    "AddEventListenerOptions",
    "CredentialCreationOptions",
    "CredentialRequestOptions",
    "SchedulerPostTaskOptions",
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
    val parentName: String?,
    val parentTypeParameters: String?,
) : ExtensionsCollector {

    init {
        require(parentName != null || parentTypeParameters == null) {
            "Parent name should be specified for type parameters: $parentTypeParameters"
        }

        require(parentTypeParameters?.startsWith("<")?.not() ?: true) {
            "Type parameters should be extracted before: $parentTypeParameters"
        }
    }

    private val extensions = mutableListOf<String>()

    override fun getResult(): String {
        return extensions.joinToString("\n\n")
    }

    val fullParentName by lazy {
        when {
            parentName == null -> ""
            parentTypeParameters == null -> "$parentName."
            else -> parseTypeParametersNames(parentTypeParameters)
                .joinToString(",")
                .let { "$parentName<$it>." }
        }
    }

    private fun generateSuspendBody(
        functionName: String,
        parameterNames: List<String>,
        parametersToSkip: Int,
        returnType: String,
        isAbortable: Boolean,
    ): String {
        val argumentNames = parameterNames.subList(0, parameterNames.size - parametersToSkip)
        var arguments = argumentNames.mapIndexed { i, arg ->
            if (i == parameterNames.lastIndex && isAbortable) {
                "$arg = patchAbortOptions($arg, $CONTROLLER),"
            } else "$arg = $arg,"
        }.joinToString(
            separator = "\n",
            prefix = (if (argumentNames.isNotEmpty()) "\n" else ""),
            postfix = (if (argumentNames.isNotEmpty()) "\n" else ""),
        )

        if (isAbortable && parametersToSkip > 0) {
            arguments += "${parameterNames.last()} = createAbortable($CONTROLLER),\n"
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
            else -> "return"
        }

        return when {
            isAbortable -> """
                $CONTROLLER_INIT
                $returnKeyword $promiseCall.awaitCancellable($CONTROLLER)$resultCast
            """.trimIndent()

            else -> "$returnKeyword $promiseCall.await()$resultCast"
        }
    }

    override fun add(
        functionName: String,
        functionSignature: String,
        parameters: String,
        returnType: String,
        docs: String?,
    ) {
        require(returnType.isEmpty() || returnType.startsWith(":")) {
            "Return type should start with colon: $returnType in $fullParentName$functionName"
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
        for (parametersToSkip in externallyDefinedParametersCount downTo 0) {
            val comment = docs?.let { "$it\n" }.orEmpty()
            val funTypeParameters = parentTypeParameters?.let { "<$it>" }.orEmpty()
            val parametersSlice = parametersList.subList(0, parametersList.size - parametersToSkip)
            val body = generateSuspendBody(
                functionName,
                parameterNames,
                parametersToSkip,
                returnType,
                isAbortable
            )

            val isInline = CONTROLLER_INIT !in body
            var newParameters = "(${parametersSlice.joinToString(",")})"
            if (isInline) {
                newParameters = newParameters.withNoInline(parameterNames)
            }


            val modifiers = if (isInline) "inline" else ""
            val extension = """
            ${comment}suspend $modifiers $functionSignature $funTypeParameters $fullParentName$functionName$newParameters$returnType {
                $body
            }
            """.trimIndent()
            extensions.add(extension)
        }
    }
}
