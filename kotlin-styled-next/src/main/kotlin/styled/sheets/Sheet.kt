package styled.sheets

import kotlinx.browser.window
import org.w3c.dom.HTMLStyleElement
import styled.GlobalStyles.injectScheduled

internal typealias GroupId = Int

internal const val styleId = "ksc-global-style"
internal const val importStyleId = "ksc-global-style-imports"

internal enum class RuleType { REGULAR, IMPORT }

internal interface Sheet {
    /**
     * Schedule [rules] for injection into the DOM.
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(rules: Iterable<String>): GroupId
    fun injectScheduled()
}

internal abstract class AbstractSheet(private val ruleType: RuleType) : Sheet {
    fun appendStyleElement(): HTMLStyleElement {
        val style = window.document.head!!.appendChild(window.document.createElement("style")) as HTMLStyleElement
        val id = when (ruleType) {
            RuleType.REGULAR -> styleId
            RuleType.IMPORT -> importStyleId
        }
        style.setAttribute("id", id)
        return style
    }

    internal abstract fun clear()
}
