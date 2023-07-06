package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

private const val message = "Unexpected generated CSS block"

class TestBoxModelProperties {
    /**
     * background-position
     */
    private val backgroundPositionCases = listOf(
        PropertyTestCase(
            """
                background-position: center bottom;

            """
        ) { backgroundPosition = RelativePosition.centerBottom },
    )

    /**
     * border
     */
    private val borderProp = Border(1.px, BorderStyle.solid, Color.red)
    private val borderValue = "1px solid red"
    private val borderTestCases = listOf(
        PropertyTestCase(
            """
                border: $borderValue;

            """
        ) { border = borderProp },

        PropertyTestCase(
            """
                border-top: $borderValue;

            """
        ) { borderTop = borderProp },

        PropertyTestCase(
            """
                border-bottom: $borderValue;

            """
        ) { borderBottom = borderProp },

        PropertyTestCase(
            """
                border-left: $borderValue;

            """
        ) { borderLeft = borderProp },

        PropertyTestCase(
            """
                border-right: $borderValue;

            """
        ) { borderRight = borderProp },

        PropertyTestCase(
            """
                border: 0 none transparent;

            """
        ) { border = Border.none },
    )

    /**
     * flex
     */
    private val flexTestCases = listOf(
        PropertyTestCase(
            """
                flex: 1;

            """
        ) { flex = Flex(1) },

        PropertyTestCase(
            """
                flex: 10px;

            """
        ) { flex = Flex(10.px) },

        PropertyTestCase(
            """
                flex: 1 1;

            """
        ) { flex = Flex(1, 1) },

        PropertyTestCase(
            """
                flex: 1 10px;

            """
        ) { flex = Flex(1, 10.px) },

        PropertyTestCase(
            """
                flex: 1 1 fit-content;

            """
        ) { flex = Flex(1, 1, FlexBasis.fitContent) },

        PropertyTestCase(
            """
                flex: 1 1 10px;

            """
        ) { flex = Flex(1, 1, 10.px) },

        PropertyTestCase(
            """
                flex: 0 0 auto;

            """
        ) { flex = Flex.NONE },

        PropertyTestCase(
            """
                flex: 1 0 auto;

            """
        ) { flex = Flex.GROW },

        PropertyTestCase(
            """
                flex: 0 1 auto;

            """
        ) { flex = Flex.SHRINK },

        PropertyTestCase(
            """
                flex: 1 1 auto;

            """
        ) { flex = Flex.GROW_SHRINK },
    )

    /**
     * inset
     */
    private val insetTestCases = listOf(
        PropertyTestCase(
            """
                inset: 10px;

            """
        ) { inset = Inset(10.px) },

        PropertyTestCase(
            """
                inset: 10px 20px;

            """
        ) { inset = Inset(10.px, 20.px) },

        PropertyTestCase(
            """
                inset: 10px 20px 30px;

            """
        ) { inset = Inset(10.px, 20.px, 30.px) },

        PropertyTestCase(
            """
                inset: 10px 20px 30px 40px;

            """
        ) { inset = Inset(10.px, 20.px, 30.px, 40.px) }
    )

    /**
     * margin
     */
    private val marginTestCases = listOf(
        PropertyTestCase(
            """
                margin: 10px;

            """
        ) { margin = Margin(10.px) },

        PropertyTestCase(
            """
                margin: 10px 20px;

            """
        ) { margin = Margin(10.px, 20.px) },

        PropertyTestCase(
            """
                margin: 10px 20px 30px;

            """
        ) { margin = Margin(10.px, 20.px, 30.px) },

        PropertyTestCase(
            """
                margin: 10px 20px 30px 40px;

            """
        ) { margin = Margin(10.px, 20.px, 30.px, 40.px) },
    )

    /**
     * padding
     */
    private val paddingTestCases = listOf(
        PropertyTestCase(
            """
                padding: 10px;

            """
        ) { padding = Padding(10.px) },

        PropertyTestCase(
            """
                padding: 10px 20px;

            """
        ) { padding = Padding(10.px, 20.px) },

        PropertyTestCase(
            """
                padding: 10px 20px 30px;

            """
        ) { padding = Padding(10.px, 20.px, 30.px) },

        PropertyTestCase(
            """
                padding: 10px 20px 30px 40px;

            """
        ) { padding = Padding(10.px, 20.px, 30.px, 40.px) },

        PropertyTestCase(
            """
                padding-right: 10px;
                padding-left: 10px;

            """
        ) { padding = Padding(horizontal = 10.px) },

        PropertyTestCase(
            """
                padding-top: 10px;
                padding-bottom: 10px;

            """
        ) { padding = Padding(vertical = 10.px) },

        PropertyTestCase(
            """
                padding-top: 10px;
                padding-left: 10px;

            """
        ) { padding = Padding(top = 10.px, left = 10.px) },

        PropertyTestCase(
            """
                padding-right: 10px;
                padding-bottom: 10px;

            """
        ) { padding = Padding(bottom = 10.px, right = 10.px) },
    )


    data class PropertyTestCase(
        val expected: String,
        val propRuleSet: RuleSet,
    )

    @Test
    fun testProperties() {
        (backgroundPositionCases + borderTestCases + flexTestCases + insetTestCases + marginTestCases + paddingTestCases).forEach { (expected, propRuleSet) ->
            val cssBuilderProp = CssBuilder()

            ruleSet(propRuleSet).invoke(cssBuilderProp)

            assertEquals(expected.trimIndent(), cssBuilderProp.toString(), message)
        }
    }
}
