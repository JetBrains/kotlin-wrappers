package kotlinx.css

import kotlinx.css.properties.Border
import kotlinx.css.properties.border
import kotlinx.css.properties.borderTop
import kotlinx.css.properties.borderLeft
import kotlinx.css.properties.borderRight
import kotlinx.css.properties.borderBottom
import kotlin.test.Test
import kotlin.test.assertEquals

private const val message = "Unexpected generated CSS block"

class TestBoxModelProperties {
    private val borderValue = "1px solid red"
    private val borderProp = Border(1.px, BorderStyle.solid, Color.red)
    private val borderTestCases = listOf(
        PropertyTestCase(
            """
                border: $borderValue;

            """,
        ) { border = borderProp },

        PropertyTestCase(
            """
                border-top: $borderValue;

            """,
        ) { borderTop = borderProp },

        PropertyTestCase(
            """
                border-bottom: $borderValue;

            """,
        ) { borderBottom = borderProp },

        PropertyTestCase(
            """
                border-left: $borderValue;

            """,
        ) { borderLeft = borderProp },

        PropertyTestCase(
            """
                border-right: $borderValue;

            """,
        ) { borderRight = borderProp },
    )

    private val marginTestCases = listOf(
        PropertyTestCase(
            """
                margin: 10px;

            """,
        ) { marginProp = Margin(10.px) },
        PropertyTestCase(
            """
                margin: 10px 20px;

            """,
        ) { marginProp = Margin(10.px, 20.px) },
        PropertyTestCase(
            """
                margin: 10px 20px 30px;

            """,
        ) { marginProp = Margin(10.px, 20.px, 30.px) },
        PropertyTestCase(
            """
                margin: 10px 20px 30px 40px;

            """,
        ) { marginProp = Margin(10.px, 20.px, 30.px, 40.px) },
    )

    private val paddingTestCases = listOf(
        PropertyTestCase(
            """
                padding: 10px;

            """,
        ) { paddingProp = Padding(10.px) },
        PropertyTestCase(
            """
                padding: 10px 20px;

            """,
        ) { paddingProp = Padding(10.px, 20.px) },
        PropertyTestCase(
            """
                padding: 10px 20px 30px;

            """,
        ) { paddingProp = Padding(10.px, 20.px, 30.px) },
        PropertyTestCase(
            """
                padding: 10px 20px 30px 40px;

            """,
        ) { paddingProp = Padding(10.px, 20.px, 30.px, 40.px) },
    )

    private val insetTestCases = listOf(
        PropertyTestCase(
            """
                inset: 10px;

            """,
        ) { insetProp = Inset(10.px) },
        PropertyTestCase(
            """
                inset: 10px 20px;

            """,
        ) { insetProp = Inset(10.px, 20.px) },
        PropertyTestCase(
            """
                inset: 10px 20px 30px;

            """,
        ) { insetProp = Inset(10.px, 20.px, 30.px) },
        PropertyTestCase(
            """
                inset: 10px 20px 30px 40px;

            """,
        ) { insetProp = Inset(10.px, 20.px, 30.px, 40.px) },
    )

    private val backgroundPositionCases = listOf(
        PropertyTestCase(
            """
                background-position: center bottom;

            """
        ) { backgroundPositionProp = RelativePosition.centerBottom }
    )


    data class PropertyTestCase(
        val expected: String,
        val propRuleSet: RuleSet,
    )

    @Test
    fun testProperties() {
        (borderTestCases + marginTestCases + paddingTestCases + backgroundPositionCases + insetTestCases).forEach { (expected, propRuleSet) ->
            val cssBuilderProp = CssBuilder()

            ruleSet(propRuleSet).invoke(cssBuilderProp)

            assertEquals(expected.trimIndent(), cssBuilderProp.toString(), message)
        }
    }
}
