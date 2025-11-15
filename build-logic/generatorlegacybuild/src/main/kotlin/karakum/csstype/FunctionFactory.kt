package karakum.csstype

import karakum.common.kebabToCamel

typealias Parameters = Array<out Pair<String, String>>

internal fun factory(
    type: String,
    parameters: Parameters,
): String {
    val dataString = parameters
        .flatMap { (n) -> if (n == "lineHeight") sequenceOf("/", "$$n") else sequenceOf(" ", "$$n") }
        .drop(1)
        .joinToString("")

    return """
    inline fun $type(
        ${parameters.stringify()}
    ): $type =
        unsafeCast("$dataString")
    """.trimIndent()
}

internal fun factory(
    name: String,
    returnType: String,
    parameters: Parameters,
): String {
    val source = if (parameters.size > 1) {
        """"${parameters.joinToString(" ") { (n) -> "$$n" }}""""
    } else {
        parameters.single().first
    }

    return """
    inline fun ${name.kebabToCamel()}(
        ${parameters.stringify()}
    ): $returnType =
        unsafeCast($source)
    """.trimIndent()
}

internal fun function(
    name: String,
    returnType: String,
    parameters: Parameters,
    delimiter: String = ",",
): String {
    val typeParameters = when (returnType) {
        "T", "T?" -> "<T: JsAny>"
        else -> ""
    }

    var functionName = name.kebabToCamel()
    if (functionName == "var")
        functionName = "`$functionName`"

    var params = parameters.stringify()
    if (params.isNotEmpty())
        params = "\n$params\n"

    val cssParams = parameters
        .flatMap { (n) -> sequenceOf(prefix(name, n), parameterString(n)) }
        .filterNotNull()
        .joinToString(delimiter)

    return """
    inline fun $typeParameters $functionName($params): $returnType =
        unsafeCast("$name($cssParams)")
    """.trimIndent()
}

private fun parameterString(n: String): String =
    "$${if (n in VARARG_PARAMETERS) "{$n.joinToString(\",\")}" else n}"

private fun prefix(
    name: String,
    parameterName: String,
): String? {
    if (name == "circle" || name == "ellipse") {
        if (parameterName == "c" || parameterName == "cx") {
            return "at"
        }
    }

    if (name == "rgb" || name == "oklch") {
        when (parameterName) {
            "alpha", "a" -> return "/"
        }
    }

    return null
}

private fun Parameters.stringify(): String =
    joinToString("\n") { (n, v) ->
        val vararg = if (n in VARARG_PARAMETERS) "vararg" else ""
        "$vararg $n: $v,"
    }

private val VARARG_PARAMETERS = arrayOf(
    "stops",
    "values",
)
