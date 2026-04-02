package karakum.cesium

internal fun Definition.parseFunctionName(): String =
    body.substringBefore("<")
        .substringBefore("(")
        .substringAfterLast(" ")

internal fun Definition.parseFunctionTypeParameters(): String {
    val start = body.substringBefore("(")
    if (!start.endsWith(">"))
        return ""

    return start.removePrefix(start.substringBefore("<"))
}

internal fun Definition.parseFunctionParameters(): List<Parameter> =
    body.substringAfter("(")
        .substringBeforeLast("): ")
        .splitToSequence(", ")
        .filter { it.isNotEmpty() }
        .map(::Parameter)
        .toList()

internal fun Definition.parseFunctionReturnType(name: String): String? =
    body.substringAfterLast("): ")
        .let { kotlinType(it, name) }
        .takeIf { it != "Unit" }

