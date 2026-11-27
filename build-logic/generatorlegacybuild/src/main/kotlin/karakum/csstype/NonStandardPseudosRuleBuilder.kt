package karakum.csstype

import karakum.common.ConversionResult

const val NON_STANDARD_PSEUDOS_RULE_BUILDER = "NonStandardPseudosRuleBuilder"

private val NON_STANDARD_PSEUDO_SIMPLE_ELEMENTS = listOf(
    "::-moz-color-swatch",
    "::-moz-focus-inner",
    "::-moz-list-bullet",
    "::-moz-list-number",
    "::-moz-page",
    "::-moz-page-sequence",
    "::-moz-progress-bar",
    "::-moz-range-progress",
    "::-moz-range-thumb",
    "::-moz-range-track",
    "::-moz-scrolled-page-sequence",
    "::-webkit-color-swatch",
    "::-webkit-inner-spin-button",
    "::-webkit-meter-bar",
    "::-webkit-meter-even-less-good-value",
    "::-webkit-meter-inner-element",
    "::-webkit-meter-optimum-value",
    "::-webkit-meter-suboptimum-value",
    "::-webkit-outer-spin-button",
    "::-webkit-progress-bar",
    "::-webkit-progress-inner-element",
    "::-webkit-progress-value",
    "::-webkit-scrollbar",
    "::-webkit-scrollbar-button",
    "::-webkit-scrollbar:horizontal",
    "::-webkit-scrollbar-thumb",
    "::-webkit-scrollbar-track",
    "::-webkit-scrollbar-track-piece",
    "::-webkit-scrollbar:vertical",
    "::-webkit-scrollbar-corner",
    "::-webkit-resizer",
    "::-webkit-search-cancel-button",
    "::-webkit-search-results-button",
    "::-webkit-slider-runnable-track",
    "::-webkit-slider-thumb",
)

// language=Kotlin
private val BODY = """
import csstype.$RULE_BUILDER

interface $NON_STANDARD_PSEUDOS_RULE_BUILDER<T : Any> : $RULE_BUILDER<T> {
    ${
    NON_STANDARD_PSEUDO_SIMPLE_ELEMENTS.joinToString(
        separator = "\n\n",
        transform = ::convertSimplePseudo,
    )
}
}
""".trimIndent()

internal fun NonStandardPseudosRuleBuilder(): ConversionResult =
    ConversionResult(
        name = NON_STANDARD_PSEUDOS_RULE_BUILDER,
        body = BODY,
    )
