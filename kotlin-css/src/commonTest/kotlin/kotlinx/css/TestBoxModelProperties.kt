package kotlinx.css

import kotlinx.css.properties.*
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
        PropertyTestCase(
            """
                border: 0 none transparent;

            """,
        ) { border = Border.none },
    )

    private val marginTestCases = listOf(
        PropertyTestCase(
            """
                margin: 10px;

            """,
        ) { margin = Margin(10.px) },
        PropertyTestCase(
            """
                margin: 10px 20px;

            """,
        ) { margin = Margin(10.px, 20.px) },
        PropertyTestCase(
            """
                margin: 10px 20px 30px;

            """,
        ) { margin = Margin(10.px, 20.px, 30.px) },
        PropertyTestCase(
            """
                margin: 10px 20px 30px 40px;

            """,
        ) { margin = Margin(10.px, 20.px, 30.px, 40.px) },
    )

    private val paddingTestCases = listOf(
        PropertyTestCase(
            """
                padding: 10px;

            """,
        ) { padding = Padding(10.px) },
        PropertyTestCase(
            """
                padding: 10px 20px;

            """,
        ) { padding = Padding(10.px, 20.px) },
        PropertyTestCase(
            """
                padding: 10px 20px 30px;

            """,
        ) { padding = Padding(10.px, 20.px, 30.px) },
        PropertyTestCase(
            """
                padding: 10px 20px 30px 40px;

            """,
        ) { padding = Padding(10.px, 20.px, 30.px, 40.px) },
        PropertyTestCase(
            """
                padding-right: 10px;
                padding-left: 10px;

            """,
        ) { padding = Padding(horizontal = 10.px) },
        PropertyTestCase(
            """
                padding-top: 10px;
                padding-bottom: 10px;

            """,
        ) { padding = Padding(vertical = 10.px) },
        PropertyTestCase(
            """
                padding-top: 10px;
                padding-left: 10px;

            """,
        ) { padding = Padding(top = 10.px, left = 10.px) },
        PropertyTestCase(
            """
                padding-right: 10px;
                padding-bottom: 10px;

            """,
        ) { padding = Padding(bottom = 10.px, right = 10.px) },
    )

    private val insetTestCases = listOf(
        PropertyTestCase(
            """
                inset: 10px;

            """,
        ) { inset = Inset(10.px) },
        PropertyTestCase(
            """
                inset: 10px 20px;

            """,
        ) { inset = Inset(10.px, 20.px) },
        PropertyTestCase(
            """
                inset: 10px 20px 30px;

            """,
        ) { inset = Inset(10.px, 20.px, 30.px) },
        PropertyTestCase(
            """
                inset: 10px 20px 30px 40px;

            """,
        ) { inset = Inset(10.px, 20.px, 30.px, 40.px) },
    )

    private val backgroundPositionCases = listOf(
        PropertyTestCase(
            """
                background-position: center bottom;

            """
        ) { backgroundPosition = RelativePosition.centerBottom }
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
