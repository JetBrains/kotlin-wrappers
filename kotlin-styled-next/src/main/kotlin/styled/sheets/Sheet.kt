package styled.sheets

import kotlinx.browser.window
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
import styled.GlobalStyles.injectScheduled

internal const val styleId = "ksc-global-style"
internal const val importStyleId = "ksc-global-style-imports"

internal enum class RuleType {REGULAR, IMPORT}

internal interface Sheet {
    /**
     * Schedule [rules] for injection into the DOM.
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(rules: Iterable<String>, type: RuleType = RuleType.REGULAR): Int
    fun injectScheduled()
    fun removeRules(removedGroupId: Int): Boolean
    fun useCss(groupId: Int)
}

internal abstract class AbstractSheet : Sheet {
    fun appendStyleElement(id: String): HTMLStyleElement {
        val style = window.document.head!!.appendChild(window.document.createElement("style")) as HTMLStyleElement
        style.setAttribute("id", id)
        return style
    }

    protected fun inject(sheet: CSSStyleSheet, rules: MutableList<String>): IntRange {
        val start: Int = sheet.cssRules.length
        var ruleId: Int = start
        try {
            for (rule in rules) {
                sheet.insertRule(rule, ruleId)
                ruleId++
            }
        } catch (e: Throwable) {
            /* Browser does not support the rule */
        }
        rules.clear()
        return start until ruleId
    }
}