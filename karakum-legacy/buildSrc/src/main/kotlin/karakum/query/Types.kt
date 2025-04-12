package karakum.query

fun getTypeName(
    source: String,
    keyword: String,
    fixAction: Boolean = false,
): String {
    var name = source
        .substringAfter("$keyword ")
        .substringBefore(" ")
        .substringBefore("<")

    if (fixAction && name.endsWith("Action")) {
        name = "Mutation$name"
    }

    return name
}

fun formatParameters(parameters: List<String>): String {
    if (parameters.isEmpty())
        return ""

    return parameters.joinToString(", ", "<", ">")
}

fun parseTypeParameters(
    source: String,
): List<String> {
    if (!source.endsWith(">")) {
        return emptyList<String>()
    }

    return source.substringAfter("<")
        .removeSuffix(">")
        .replace(" extends QueryOptions<any, any, any, ", " extends QueryOptions<*, *, *, ")
        .replace(" any[]", " ReadonlyArray<*>")
        .splitToSequence(", ")
        .map { it.substringBefore(" = ") }
        .map { it.replace(" extends ", ": ") }
        .map { if (it.endsWith(": Function")) "$it<*>" else it }
        .toList()
}
