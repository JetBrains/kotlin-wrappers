package kotlinx.css

import kotlinx.css.properties.Animation
import kotlinx.css.properties.Timing
import kotlinx.css.properties.s
import kotlin.test.Test
import kotlin.test.assertEquals

private const val message = "Unexpected generated CSS block"

class TestAnimation {
    private val testCases = listOf(
        PropertyTestCase(
            """
                animation: 0s ease 0s 1 normal none running animation;

            """
        ) { animation += Animation("animation") },

        PropertyTestCase(
            """
                animation: 1s ease-in 0.5s 1 normal none running animation;

            """
        ) { animation += Animation("animation", 1.s, Timing.easeIn, 0.5.s) },

        PropertyTestCase(
            """
                animation: 0s ease 0s 1 normal none running animation-one, 0s ease 0s 1 normal none running animation-two;

            """
        ) {
            animation += Animation("animation-one")
            animation += Animation("animation-two")
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
