package emotion.styled

private val escapeRegex = Regex("""[!"#$%&'()*+,./:;<=>?@\[\\\]^`{|}~-]+""")

private val dashesAtEnds = Regex("""(^-|-$)""")

internal fun escape(string: String): String {
    return string // Replace all possible CSS selectors
        .replace(escapeRegex, "-") // Remove extraneous hyphens at the start and end
        .replace(dashesAtEnds, "")
}
