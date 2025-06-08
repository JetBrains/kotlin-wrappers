package karakum.browser

internal fun formatComment(
    comment: String,
): String {
    val formatted = if ("\n" !in comment) {
        comment
            .replaceFirst("/** ", "/**\n * ")
            .removeSuffix(" */") + "\n */"
    } else comment

    return formatted.replace(Typography.nbsp.toString(), " ")
}

internal fun String.withComment(
    fullSource: String,
    source: String,
): String {
    val commentSource = fullSource.substringBefore("\n$source", "")
        .takeIf { it.endsWith(" */") }
        ?: return this

    val comment = formatComment("/**" + commentSource.substringAfterLast("\n/**"))
    return "$comment\n${this}"
}

internal fun ConversionResult.withComment(
    fullSource: String,
    source: String,
): ConversionResult? {
    val newBody = body.withComment(
        fullSource = fullSource,
        source = source,
    )

    if ("@deprecated" in newBody)
        return null

    return if (body != newBody) {
        copy(body = newBody)
    } else this
}
