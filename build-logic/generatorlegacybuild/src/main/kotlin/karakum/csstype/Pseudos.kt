package karakum.csstype

import karakum.common.ConversionResult
import karakum.common.unionConstant

internal fun convertMetaPseudos(
    name: String,
    source: String,
): ConversionResult {
    val builderName = "$name$RULE_BUILDER"
    val parentTypes = source
        .substringAfter(" = ")
        .substringBefore(";")
        .splitToSequence(" | ")
        .minus("SimplePseudos")
        .joinToString(",\n") { "$it$RULE_BUILDER<T>" }

    return ConversionResult(
        builderName,
        "interface $builderName<T: Any>:\n$parentTypes",
    )
}

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
): String = sequenceOf(SELECTOR, "String").joinToString("\n\n") { type ->
    """
        inline fun ${unionConstant(selector).name.replaceFirstChar(Char::lowercase)}(
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

    val methods = selectors.joinToString("\n\n", transform = method)

    // TEMP
    if ("inline fun" !in methods)
        return ConversionResult(name, methods)

    val body = """
        interface $name<T: Any>: $RULE_BUILDER<T> {
            $methods
        }
    """.trimIndent()

    return ConversionResult(name, body)
}
