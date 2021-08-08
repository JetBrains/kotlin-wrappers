package styled

import kotlinx.browser.window
import kotlinx.css.CssBuilder
import kotlinx.css.properties.KeyframesBuilder
import kotlinx.dom.appendText
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
import react.StateInstance
import kotlin.collections.*

internal typealias InjectedCssHolder = LinkedHashMap<StyledCss, String>

/**
 * Inject CSS rules defined in [css] into the DOM
 */
fun injectGlobal(css: CssBuilder) {
    GlobalStyles.scheduleToInject(css.toStyledCss().getCssRules(null))
    GlobalStyles.injectScheduled()
}

internal val isDevelopment by lazy {
    js("process.env.NODE_ENV !== 'production'") as Boolean
}

object GlobalStyles {
    internal var isTest = false
    internal const val styleId = "ksc-global-styles"
    private val style by lazy {
        val style = window.document.head!!.appendChild(window.document.createElement("style")) as HTMLStyleElement
        style.setAttribute("id", styleId)
        style
    }
    private val sheet by lazy {
        style.sheet as CSSStyleSheet
    }

    private var incrementedClassName: Int = 0
        get() {
            field++
            return field
        }

    internal var styledClasses = InjectedCssHolder()
    internal val scheduledRules = mutableListOf<String>()
    internal val injectedStyleSheetRules = mutableSetOf<Selector>()

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
        var maxIdx = sheet.cssRules.length
        if (isDevelopment && !isTest) {
            style.appendText(scheduledRules.joinToString("\n"))
            scheduledRules.clear()
            return
        }
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
    fun scheduleToInject(selector: Selector, builder: CssBuilder) {
        if (!injectedStyleSheetRules.contains(selector)) {
            val styled = builder.toStyledCss()
            scheduleToInject(styled.getCssRules(selector))
            injectedStyleSheetRules.add(selector)
        }
    }

    internal val injectedKeyframes = mutableMapOf<StyledKeyframes, ClassName>()

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
     * @return pair of generated class name and a list of CSS class names, declared in [css].
     * If the CSS code for the [css] was not injected into the DOM previously, it is injected after function call.
     */
    fun getInjectedClassNames(css: CssBuilder): Pair<ClassName, List<ClassName>> {
        val styledCss = css.toStyledCss()
        val selfClassName = getInjectedClassName(styledCss)
        val externalClassNames = styledCss.classes
        return Pair(selfClassName, externalClassNames)
    }

    /**
     * Show a warning when too many css blocks are created for one component
     */
    internal fun checkGeneratedCss(state: StateInstance<HashSet<String>?>, className: ClassName, type: String) {
        val (classes, setClasses) = state
        // Message was already shown
        if (classes == null) return

        val maxStylesForElement = 50
        val size = classes.size
        classes.add(className)
        if (classes.size > maxStylesForElement) {
            console.warn(
                "Over $maxStylesForElement were generated for $type object.\n" +
                        "Consider using inline styles for frequently changed styles." +
                        "Example:" +
                        "styledDiv {\n" +
                        "  inlineStyles {\n" +
                        "  width = 100.px\n" +
                        "  backgroundColor = Color.blue\n" +
                        "  }\n" +
                        "}\n"
            )
            setClasses(null)
        } else {
            if (size != classes.size) {
                setClasses(classes)
            }
        }
    }
}
