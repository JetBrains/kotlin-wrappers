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
        .joinToString(",\n") { "$it$RULE_BUILDER<T>" }
        .plus(",\n$NON_STANDARD_PSEUDOS_RULE_BUILDER<T>")
        .plus(",\n$EXPERIMENTAL_PSEUDOS_RULE_BUILDER<T>")

    return ConversionResult(
        builderName,
        "interface $builderName<T: Any>:\n$parentTypes",
    )
}

internal fun convertPseudos(
    name: String,
    source: String,
): ConversionResult {
    val method: (String) -> String = when (name) {
        "SimplePseudos" -> ::convertSimplePseudo
        "AdvancedPseudos" -> ::convertAdvancedPseudo
        else -> TODO("Method for `$name`")
    }

    return convertPseudos(name, source, method)
}

internal fun convertSimplePseudo(
    selector: String,
): String = """
    inline fun ${unionConstant(selector).name.replaceFirstChar(Char::lowercase)}(
        block: T.() -> Unit,
    ) {
        "$selector"(block)
    }
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
    val builderName = "$name$RULE_BUILDER"
    val selectors = source.substringAfter("=\n")
        .substringBefore(";")
        .trimIndent()
        .trimMargin("| ")
        .split("\n")
        .toUnionValues()
        .filter { it != ":matches()" }
        .distinctBy { it.removePrefix("::").removePrefix(":") }

    val methods = selectors.joinToString("\n\n", transform = method)

    val body = """
        interface $builderName<T: Any>: $RULE_BUILDER<T> {
            $methods
        }
    """.trimIndent()

    return ConversionResult(builderName, body)
}
