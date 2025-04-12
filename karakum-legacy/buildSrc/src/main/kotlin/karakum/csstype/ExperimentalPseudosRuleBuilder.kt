package karakum.csstype

import karakum.common.ConversionResult

const val EXPERIMENTAL_PSEUDOS_RULE_BUILDER = "ExperimentalPseudosRuleBuilder"

private val EXPERIMENTAL_PSEUDO_SIMPLE_ELEMENTS = listOf(
    "::view-transition-group",
    "::view-transition-image-pair",
    "::view-transition-new",
    "::view-transition-old",
)

// language=Kotlin
private val BODY = """
import csstype.$RULE_BUILDER

interface $EXPERIMENTAL_PSEUDOS_RULE_BUILDER<T : Any> : $RULE_BUILDER<T> {
    ${
    EXPERIMENTAL_PSEUDO_SIMPLE_ELEMENTS.joinToString(
        separator = "\n\n",
        transform = ::convertSimplePseudo,
    )
}
}
""".trimIndent()

internal fun ExperimentalPseudosRuleBuilder(): ConversionResult =
    ConversionResult(
        name = EXPERIMENTAL_PSEUDOS_RULE_BUILDER,
        body = BODY,
    )
