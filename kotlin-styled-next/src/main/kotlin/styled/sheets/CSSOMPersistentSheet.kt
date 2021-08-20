package styled.sheets

import org.w3c.dom.css.CSSStyleSheet

// A stylesheet that is injected using the CSSOM API. Useful in production mode because of better performance,
// but can't be easily edited using devtools.
internal class CSSOMPersistentSheet(type: RuleType) : AbstractSheet(type) {
    internal val sheet by lazy { appendStyleElement().sheet as CSSStyleSheet }
    internal val scheduledRules = mutableListOf<String>()

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
        inject(sheet, scheduledRules)
    }

    override fun clear() {
        scheduledRules.clear()
    }
}