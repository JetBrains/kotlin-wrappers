package kotlinx.css

import kotlinx.css.properties.*
import kotlin.test.Test
import kotlin.test.assertEquals

class TestTransform {
    private val testCases = listOf(
        PropertyTestCase(
            """
                transform: translateY(100%);

            """
        ) {
            transform {
                translateY(0.pct)
            }
            transform {
                translateY(100.pct)
            }
        },
        PropertyTestCase(
            """
                from {
                transform: translateX(-100%);
                }
                to {
                transform: translateX(0);
                }

            """
        ) {
            "from" {
                transform { translateX((-100).pct) }
            }
            "to" {
                transform { translateX(0.pct) }
            }
        },
        PropertyTestCase(
            """
                transform: translateY(0) translateY(100%);

            """
        ) {
            transform {
                translateY(0.pct)
            }

            transform += Transform("translateY", arrayOf(100.pct))
        },
    )

    @Test
    fun testProperties() {
        testCases.forEach { (expected, propRuleSet) ->
            val cssBuilderProp = CssBuilder()

            ruleSet(propRuleSet).invoke(cssBuilderProp)

            assertEquals(expected.trimIndent(), cssBuilderProp.toString(), "Unexpected transform value")
        }
    }
}
