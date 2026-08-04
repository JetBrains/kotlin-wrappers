package karakum.cesium

internal fun Definition.parseFunctionName(): String =
    parseFunctionNameWithOptionality()
        .removeSuffix("?")

internal fun Definition.isOptionalFunction(): Boolean =
    parseFunctionNameWithOptionality()
        .endsWith("?")

private fun Definition.parseFunctionNameWithOptionality(): String =
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

internal fun Definition.parseFunctionReturnType(
    name: String,
    optional: Boolean,
): String? =
    body.substringAfterLast("): ")
        .let { kotlinType(it, name) }
        .takeIf { optional || it != "Unit" }
