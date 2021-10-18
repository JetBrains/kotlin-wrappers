package styled.sheets

import kotlinx.dom.appendText

/**
* A stylesheet that is injected by setting the text of a <style> tag. Useful in development mode,
* because the stylesheet can be easily viewed using devtools, but relatively slow.
* Consider using [StyledNext.getCss], [StyledNext.downloadCss] instead.
*/
internal class DevSheet(type: RuleType) : AbstractSheet(type) {
    private val style by lazy { appendStyleElement() }
    private val scheduledRules = mutableListOf<String>()

    override fun scheduleToInject(rules: Iterable<String>): GroupId {
        scheduledRules.addAll(rules)
        return 0
    }

    override fun injectScheduled() {
        style.appendText(scheduledRules.joinToString("\n"))
        scheduledRules.clear()
    }

    override fun clear() {
        scheduledRules.clear()
    }
}