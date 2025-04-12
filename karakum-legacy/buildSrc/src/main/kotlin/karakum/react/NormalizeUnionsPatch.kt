package karakum.react

private fun String.normalizeUnions(): String =
    replace(Regex("""\n\s+\| """), " | ")

internal fun String.applyNormalizeUnionsPatch(): String = this
    .normalizeUnions()
    .replace(": | \"", ": \"")
