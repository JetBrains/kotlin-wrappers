package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

class TestRelativePosition {
    @Test
    fun keywordValues() {
        assertRuleSet("background-position: top;") { backgroundPositionProp = RelativePosition.top }
        assertRuleSet("background-position: bottom;") { backgroundPositionProp = RelativePosition.bottom }
        assertRuleSet("background-position: left;") { backgroundPositionProp = RelativePosition.left }
        assertRuleSet("background-position: right;") { backgroundPositionProp = RelativePosition.right }
        assertRuleSet("background-position: center;") { backgroundPositionProp = RelativePosition.center }
    }

    @Test
    fun percentageValues() {
        assertRuleSet("background-position: 25% 75%;") { backgroundPositionProp = RelativePosition.offset(25.pct, 75.pct) }
    }

    @Test
    fun lengthValues() {
        assertRuleSet("background-position: 0 1px;") { backgroundPositionProp = RelativePosition.offset(0.px, 1.px) }
        assertRuleSet("background-position: 1cm 2cm;") { backgroundPositionProp = RelativePosition.offset(1.cm, 2.cm) }
        assertRuleSet("background-position: 10mm 8em;") { backgroundPositionProp = RelativePosition.offset(10.mm, 8.em) }
    }

    @Test
    fun globalValues() {
        assertRuleSet("background-position: inherit;") { backgroundPositionProp = RelativePosition.inherit }
        assertRuleSet("background-position: initial;") { backgroundPositionProp = RelativePosition.initial }
        assertRuleSet("background-position: unset;") { backgroundPositionProp = RelativePosition.unset }
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
