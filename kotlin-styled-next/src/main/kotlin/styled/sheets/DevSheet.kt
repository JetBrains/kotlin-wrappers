package styled.sheets

import kotlinx.dom.appendText

internal class DevSheet : AbstractSheet() {
    private val style by lazy { appendStyleElement(styleId) }
    private val importsStyle by lazy { appendStyleElement("$importStyleId") }
    private val scheduledRules = mutableListOf<String>()
    private val scheduledImportRules = mutableListOf<String>()

    override fun scheduleToInject(rules: Iterable<String>, type: RuleType): Int {
        when (type) {
            RuleType.REGULAR -> scheduledRules.addAll(rules)
            RuleType.IMPORT -> scheduledImportRules.addAll(rules)
        }
        return 0
    }

    override fun injectScheduled() {
        style.appendText(scheduledRules.joinToString("\n"))
        importsStyle.appendText(scheduledImportRules.joinToString("\n"))
    }

    override fun useCss(groupId: Int) {}

    override fun removeRules(removedGroupId: Int): Boolean {
        // Performance is not an issue in development mode
        return false
    }
}