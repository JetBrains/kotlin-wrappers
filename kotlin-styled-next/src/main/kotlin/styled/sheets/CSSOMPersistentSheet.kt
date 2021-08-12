package styled.sheets

import org.w3c.dom.css.CSSStyleSheet

internal class CSSOMPersistentSheet : AbstractSheet() {
    internal val sheet by lazy { appendStyleElement(styleId).sheet as CSSStyleSheet }
    internal val importsSheet by lazy { appendStyleElement(importStyleId).sheet as CSSStyleSheet }
    internal val scheduledRules = mutableListOf<String>()
    internal val scheduledImportRules = mutableListOf<String>()

    override fun scheduleToInject(rules: Iterable<String>, type: RuleType) {
        when (type) {
            RuleType.REGULAR -> scheduledRules.addAll(rules)
            RuleType.IMPORT -> scheduledImportRules.addAll(rules)
        }
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
        inject(importsSheet, scheduledImportRules)
    }
}