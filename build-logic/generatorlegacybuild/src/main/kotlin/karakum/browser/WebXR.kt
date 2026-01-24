package karakum.browser

internal fun webXrDeclarations(
    source: String,
): Sequence<ConversionResult> {
    val content = webXrContent(source)

    val types = convertTypes(
        content = content,
        getPkg = { "web.xr" },
    ).filter { !it.name.endsWith("EventType") }

    return types
}

internal fun webXrContent(
    content: String,
): String =
    content
        .replace(" =\n    | ", " = ")
        .replace("\n    | ", " | ")
