package karakum.csstype

import karakum.common.ConversionResult

internal fun convertPseudos(
    name: String,
    source: String,
): ConversionResult =
    when (name) {
        "SimplePseudos" -> convertPseudos("SimplePseudoClasses", source, ::convertSimplePseudo)
        "AdvancedPseudos" -> convertPseudos("$name$RULE_BUILDER", source, ::convertAdvancedPseudo)
        else -> TODO("Method for `$name`")
    }

internal fun convertSimplePseudo(
    selector: String,
): String = """
inline val `$selector`: $SELECTOR
    get() = Selector("$selector")
""".trimIndent()

internal fun convertAdvancedPseudo(
    selector: String,
): String =
    sequenceOf(SELECTOR, "String")
        .joinToString("\n\n") { type ->
            """
            context(_: $RULE_BUILDER<T>)
            inline fun <T : Any> `$selector`(
                selector: $type,
                block: T.() -> Unit,
            ) {
                "$selector(${'$'}selector)"(block)
            }
            """.trimIndent()
        }

private fun convertPseudos(
    name: String,
    source: String,
    method: (selector: String) -> String,
): ConversionResult {
    val selectors = source.substringAfter("=\n")
        .substringBefore(";")
        .trimIndent()
        .trimMargin("| ")
        .split("\n")
        .toUnionValues()
        .filter { it != ":matches()" }
        .distinctBy { it.removePrefix("::").removePrefix(":") }

    return ConversionResult(
        name = name,
        body = selectors.joinToString("\n\n", transform = method),
    )
}
