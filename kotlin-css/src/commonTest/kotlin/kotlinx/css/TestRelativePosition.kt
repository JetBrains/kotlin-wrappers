package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

class TestRelativePosition {
    @Test
    fun keywordValues() {
        assertRuleSet("background-position: top;") { backgroundPosition(RelativePosition.top) }
        assertRuleSet("background-position: bottom;") { backgroundPosition(RelativePosition.bottom) }
        assertRuleSet("background-position: left;") { backgroundPosition(RelativePosition.left) }
        assertRuleSet("background-position: right;") { backgroundPosition(RelativePosition.right) }
        assertRuleSet("background-position: center;") { backgroundPosition(RelativePosition.center) }
    }

    @Test
    fun percentageValues() {
        assertRuleSet("background-position: 25% 75%;") { backgroundPosition(RelativePosition.offset(25.pct, 75.pct)) }
    }

    @Test
    fun lengthValues() {
        assertRuleSet("background-position: 0 1px;") { backgroundPosition(RelativePosition.offset(0.px, 1.px)) }
        assertRuleSet("background-position: 1cm 2cm;") { backgroundPosition(RelativePosition.offset(1.cm, 2.cm)) }
        assertRuleSet("background-position: 10mm 8em;") { backgroundPosition(RelativePosition.offset(10.mm, 8.em)) }
    }

    @Test
    fun globalValues() {
        assertRuleSet("background-position: inherit;") { backgroundPosition(RelativePosition.inherit) }
        assertRuleSet("background-position: initial;") { backgroundPosition(RelativePosition.initial) }
        assertRuleSet("background-position: unset;") { backgroundPosition(RelativePosition.unset) }
    }

    private fun assertRuleSet(expected: String, ruleSet: RuleSet) {
        val cssBuilder = CssBuilder()

        ruleSet(ruleSet).invoke(cssBuilder)

        assertEquals(
            "${expected}\n",
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }
}