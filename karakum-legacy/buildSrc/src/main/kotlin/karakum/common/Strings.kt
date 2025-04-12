package karakum.common

private val MINUS_LETTER = Regex("""-(\w)""")
private val PLUS_LETTER = Regex("""\+(\w)""")
private val SLASH_LETTER = Regex("""\/(\w)""")
private val UNDERSCORE_LETTER = Regex("""_(\w)""")
private val SPACE_LETTER = Regex("""\s(\w)""")

private val toUpperCase: (MatchResult) -> CharSequence = {
    it.groupValues[1].uppercase()
}

internal fun String.kebabToCamel(): String =
    replace(MINUS_LETTER, toUpperCase)
        .replace(PLUS_LETTER, toUpperCase)
        .replace(SLASH_LETTER, toUpperCase)
        .replace(SPACE_LETTER, toUpperCase)

internal fun String.snakeToCamel(): String =
    replace(UNDERSCORE_LETTER, toUpperCase)
        .replace(SPACE_LETTER, toUpperCase)

internal fun String.withDefaultLineBreaks(): String =
    replace("\r\n", "\n")

internal fun String.replaceSuffix(
    from: String,
    to: String,
): String {
    require(endsWith(from))

    return removeSuffix(from) + to
}

internal fun String.removeQuoteSurrounding(): String =
    removeSurrounding("'")
        .removeSurrounding("\"")

internal fun String.startsWithAnyQuote(): Boolean =
    startsWith("'") || startsWith("\"")
