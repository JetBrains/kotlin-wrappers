package styled.sheets

import kotlinx.browser.window
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.asList
import org.w3c.dom.css.CSSStyleSheet

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

internal const val DEFAULT_MAX_RULES_PER_SHEET = 50

/**
 * @param maxRulesPerSheet If style sheet contains more than [maxRulesPerSheet] rules, then new styles
 * are inserted to new style sheet to avoid possibly slow style recalculation. If [maxRulesPerSheet] is null,
 * then all styles are inserted to the single style sheet.
 */
internal abstract class AbstractSheet(
    private val ruleType: RuleType,
    protected val maxRulesPerSheet: Int? = DEFAULT_MAX_RULES_PER_SHEET
) : Sheet {
    protected val usedStyleElements = mutableListOf<HTMLStyleElement>()
    private val id: String
        get() = when (ruleType) {
            RuleType.REGULAR -> styleId
            RuleType.IMPORT -> importStyleId
        }

    private var currentStyleElement: HTMLStyleElement? = null
    private var partitionCounter = 0
    private fun createStyleElement(): HTMLStyleElement {
        val id = when (maxRulesPerSheet) {
            null -> id
            else -> "${id}_${partitionCounter++}"
        }
        val style = window.document.head!!.appendChild(window.document.createElement("style")) as HTMLStyleElement
        style.setAttribute("id", id)
        usedStyleElements += style
        return style
    }

    protected fun getCurrentStyleElement(rulesToAdd: Int): HTMLStyleElement {
        val element = currentStyleElement?.takeIf {
            it.parentNode != null && (maxRulesPerSheet == null || it.cssSheet.cssRules.length + rulesToAdd <= maxRulesPerSheet)
        } ?: createStyleElement().also {
            currentStyleElement = it
        }
        return element
    }

    protected val HTMLStyleElement.cssSheet: CSSStyleSheet get() = sheet as CSSStyleSheet

    protected fun HTMLStyleElement.removeAndCleanUp() {
        remove()
        usedStyleElements.remove(this)
        if (currentStyleElement == this) {
            currentStyleElement = null
        }
    }

    internal open fun clear() {
        usedStyleElements.toList().forEach {
            it.removeAndCleanUp()
        }
        window.document.querySelectorAll(styleElementsSelector(id)).asList().forEach {
            (it as HTMLStyleElement).remove()
        }
    }
}

internal fun styleElementsSelector(id: String) = "[id^='${id}_'],[id='$id']"