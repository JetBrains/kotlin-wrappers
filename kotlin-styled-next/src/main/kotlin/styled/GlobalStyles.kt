package styled

import kotlinx.browser.window
import kotlinx.css.CSSBuilder
import kotlinx.css.properties.KeyframesBuilder
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
import kotlin.collections.*

/**
 * Inject css code, defined in [css], to the DOM
 */
fun injectGlobal(css: CSSBuilder) {
    GlobalStyles.scheduleToInject(css.toStyledCss().getCssRules(null))
    GlobalStyles.injectScheduled()
}

object GlobalStyles {
    private val sheet by lazy {
        val style = window.document.head!!.appendChild(window.document.createElement("style")) as HTMLStyleElement
        style.setAttribute("id", "ksc-global-styles")
        style.sheet as CSSStyleSheet
    }

    private var incrementedClassName: Int = 0
        get() {
            field++
            return field
        }

    private val styledClasses = LinkedHashMap<StyledCss, ClassName>()
    private val scheduledRules = mutableListOf<String>()
    private val injectedStyleSheetRules = mutableSetOf<Selector>()

    private fun getInjectedClassName(css: StyledCss): ClassName {
        val className = styledClasses[css]
        return className ?: scheduleToInjectClassName(css)
    }

    private fun scheduleToInjectClassName(css: StyledCss): ClassName {
        val className = "ksc-$incrementedClassName"
        styledClasses[css] = className
        val selector = ".$className"
        scheduledRules.addAll(css.getCssRules(selector))
        return className
    }

    /**
     * Inject all the scheduled rules to a DOM and clear the [scheduledRules]
     * If the rule cannot be parsed by the browser, it gets thrown away.
     */
    fun injectScheduled() {
        var maxIdx = sheet.cssRules.length
        for (rule in scheduledRules.filter { it.isNotEmpty() }) {
            try {
                sheet.insertRule(rule, maxIdx)
                maxIdx++
            } catch (e: Throwable) {
                /* Browser does not support the rule */
            }
        }
        scheduledRules.clear()
    }

    /**
     * Schedule [rules] for inject to DOM.
     * They will be injected when the [injectScheduled] function will be called next time
     */
    fun scheduleToInject(rules: List<String>) {
        scheduledRules.addAll(rules)
    }

    /**
     * Schedule css from [builder] for inject to DOM with the corresponding [selector].
     * They will be injected when the [injectScheduled] function will be called next time
     */
    fun scheduleToInject(selector: Selector, builder: CSSBuilder) {
        if (!injectedStyleSheetRules.contains(selector)) {
            val styled = builder.toStyledCss()
            scheduleToInject(styled.getCssRules(selector))
            injectedStyleSheetRules.add(selector)
        }
    }

    private val injectedKeyframes = mutableMapOf<StyledKeyframes, ClassName>()

    /**
     * Schedule keyframes css in [builder] for inject to DOM.
     * They will be injected when the [injectScheduled] function will be called next time
     */
    fun scheduleToInject(builder: KeyframesBuilder.() -> Unit): ClassName {
        val keyframes = KeyframesBuilder().apply(builder).toStyledKeyframes()
        return injectedKeyframes[keyframes] ?: "ksc-keyframe-$incrementedClassName".also { keyframeName ->
            val css = keyframes.toString()
            injectedKeyframes[keyframes] = keyframeName
            val prefixes = listOf("@-webkit-keyframes", "@keyframes")
            scheduleToInject(prefixes.map { prefix -> "$prefix $keyframeName { $css }" })
        }
    }

    /**
     * @return list of classnames for the css, declared in [css].
     * If the CSS code for the [css] was not injected to DOM previously, it is injected after function call
     */

    fun getInjectedClassNames(css: CSSBuilder): List<ClassName> {
        val styledCss = css.toStyledCss()
        val selfClassName = getInjectedClassName(styledCss)
        val externalClassNames = styledCss.classes
        return listOf(selfClassName) + externalClassNames
    }
}
