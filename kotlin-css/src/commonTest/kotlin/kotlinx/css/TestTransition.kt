package kotlinx.css

import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transition
import kotlinx.css.properties.s
import kotlin.test.Test
import kotlin.test.assertEquals

private const val message = "Unexpected generated CSS block"

class TestTransition {
    private val testCases = listOf(
        PropertyTestCase(
            """
                transition: all 0s ease 0s;

            """
        ) { transition += Transition() },

        PropertyTestCase(
            """
                transition: background-color 1s ease-in 0.5s;

            """
        ) { transition += Transition("background-color", 1.s, Timing.easeIn, 0.5.s) },

        PropertyTestCase(
            """
                transition: color 1s ease-in 0.5s, background-color 1s ease-in 0.5s;

            """
        ) {
            transition += Transition("color", 1.s, Timing.easeIn, 0.5.s)
            transition += Transition("background-color", 1.s, Timing.easeIn, 0.5.s)
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
