package styled.sheets

import org.w3c.dom.css.CSSStyleSheet

internal class CSSOMPersistentSheet : AbstractSheet() {
    internal val sheet by lazy { appendStyleElement(styleId).sheet as CSSStyleSheet }
    internal val importsSheet by lazy { appendStyleElement("$importStyleId").sheet as CSSStyleSheet }
    internal val scheduledRules = mutableListOf<String>()
    internal val scheduledImportRules = mutableListOf<String>()

    override fun scheduleToInject(rules: Iterable<String>, type: RuleType): GroupId {
        when (type) {
            RuleType.REGULAR -> scheduledRules.addAll(rules)
            RuleType.IMPORT -> scheduledImportRules.addAll(rules)
        }
        return 0
    }

    override fun injectScheduled() {
        inject(sheet, scheduledRules)
        inject(importsSheet, scheduledImportRules)
    }

    override fun removeRules(removedGroupId: Int): Boolean {
        return false
    }

    override fun useCss(groupId: Int) {}
}