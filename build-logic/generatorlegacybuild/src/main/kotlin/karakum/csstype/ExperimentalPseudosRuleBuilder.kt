package karakum.csstype

import karakum.common.ConversionResult

private val EXPERIMENTAL_PSEUDO_SIMPLE_ELEMENTS = listOf(
    "::view-transition-group",
    "::view-transition-image-pair",
    "::view-transition-new",
    "::view-transition-old",
)

// language=Kotlin
private val BODY = """
import csstype.$RULE_BUILDER

${
    EXPERIMENTAL_PSEUDO_SIMPLE_ELEMENTS.joinToString("\n\n") { name ->
        """
        inline val `$name`: $SELECTOR
            get() = Selector("$name")
        """.trimIndent()
    }
}
""".trimIndent()

internal fun ExperimentalPseudoClasses(): ConversionResult =
    ConversionResult(
        name = "ExperimentalPseudoClasses",
        body = BODY,
    )
