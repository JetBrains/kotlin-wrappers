package styled.sheets

import org.w3c.dom.css.CSSStyleSheet

// A stylesheet that is injected using the CSSOM API. Useful in production mode because of better performance,
// but can't be easily edited using devtools.
internal class CSSOMPersistentSheet(type: RuleType, maxRulesPerSheet: Int? = DEFAULT_MAX_RULES_PER_SHEET) : AbstractSheet(type, maxRulesPerSheet) {
    private val scheduledRules = mutableListOf<String>()

    override fun scheduleToInject(rules: Iterable<String>): GroupId {
        scheduledRules.addAll(rules)
        return 0
    }

    private fun inject(sheet: CSSStyleSheet, rules: MutableList<String>) {
        var ruleId = sheet.cssRules.length
        for (rule in rules) {
            try {
                sheet.insertRule(rule, ruleId)
                ruleId++
            } catch (e: Throwable) {
                /* Browser does not support the rule */
            }
        }
        rules.clear()
    }

    override fun injectScheduled() {
        if (scheduledRules.isNotEmpty()) {
            inject(getCurrentStyleElement(scheduledRules.size).cssSheet, scheduledRules)
        }
    }

    override fun clear() {
        super.clear()
        scheduledRules.clear()
    }
}