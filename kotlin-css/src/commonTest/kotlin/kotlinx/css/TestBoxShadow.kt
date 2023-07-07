package kotlinx.css

import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.BoxShadowInset
import kotlin.test.Test
import kotlin.test.assertEquals

private const val message = "Unexpected generated CSS block"

class TestBoxShadow {
    private val testCases = listOf(
        PropertyTestCase(
            """
                box-shadow: 0 0 0 0 currentColor;

            """
        ) { boxShadow += BoxShadow() },

        PropertyTestCase(
            """
                box-shadow: 1px 2px 3px 4px red;

            """
        ) { boxShadow += BoxShadow(Color.red, 1.px, 2.px, 3.px, 4.px) },

        PropertyTestCase(
            """
                box-shadow: inset 1px 2px 3px 4px red;

            """
        ) { boxShadow += BoxShadowInset(Color.red, 1.px, 2.px, 3.px, 4.px) },

        PropertyTestCase(
            """
                box-shadow: 1px 2px 3px 4px red, 1px 2px 3px 4px blue;

            """
        ) {
            boxShadow += BoxShadow(Color.red, 1.px, 2.px, 3.px, 4.px)
            boxShadow += BoxShadow(Color.blue, 1.px, 2.px, 3.px, 4.px)
        }
    )

    @Test
    fun testProperties() {
        testCases.forEach { (expected, propRuleSet) ->
            val cssBuilderProp = CssBuilder()

            ruleSet(propRuleSet).invoke(cssBuilderProp)

            assertEquals(expected.trimIndent(), cssBuilderProp.toString(), message)
        }
    }
}
