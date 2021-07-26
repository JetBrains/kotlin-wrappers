package styled

import kotlinx.browser.window
import kotlinx.css.CSSBuilder
import kotlinx.css.properties.KeyframesBuilder
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
import kotlin.collections.*

internal typealias InjectedCssHolder = LinkedHashMap<StyledCss, String>

/**
 * Inject CSS rules defined in [css] into the DOM
 */
fun injectGlobal(css: CSSBuilder) {
    GlobalStyles.scheduleToInject(css.toStyledCss().getCssRules(null))
    GlobalStyles.injectScheduled()
}

private object Wrapper {
    private val wrapper: ((() -> Unit) -> Unit)? = null
    fun <T> wrap(action: () -> T): T {
        if (wrapper == null)
            return action()
        var ret: T? = null
        wrapper.invoke {
            ret = action()
        }
        return ret ?: action()
    }
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

    internal var styledClasses = InjectedCssHolder()
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
     * Inject all scheduled rules into the DOM and clear [scheduledRules].
     * If the rule cannot be parsed by the browser, it gets thrown away.
     */
    fun injectScheduled() {
        Wrapper.wrap {
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
    }

    /**
     * Schedule [rules] for injection into the DOM.
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(rules: List<String>) {
        scheduledRules.addAll(rules)
    }

    /**
     * Schedule CSS from [builder] for injection into the DOM with the corresponding [selector].
     * They will be injected when the [injectScheduled] function is called the next time.
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
     * Schedule keyframes CSS in [builder] for injection into the DOM.
     * They will be injected when the [injectScheduled] function is called the next time.
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
     * @return list of CSS class names, declared in [css].
     * If the CSS code for the [css] was not injected into the DOM previously, it is injected after function call.
     */

    fun getInjectedClassNames(css: CSSBuilder): List<ClassName> {
        val styledCss = css.toStyledCss()
        val selfClassName = getInjectedClassName(styledCss)
        val externalClassNames = styledCss.classes
        return listOf(selfClassName) + externalClassNames
    }
}
