package styled

import kotlinx.css.CssBuilder
import kotlinx.css.properties.KeyframesBuilder
import react.StateInstance
import styled.sheets.*
import kotlin.collections.*

data class UsedCssInfo(
    val className: ClassName,
    var usedBy: Int,
    val groupId: Int,
    var associatedClasses: MutableSet<String> = mutableSetOf()
)

internal typealias InjectedCssHolder = LinkedHashMap<StyledCss, UsedCssInfo>

internal fun List<String>.toClassName(): String {
    return this.joinToString(" ")
}

/**
 * Inject CSS rules defined in [css] into the DOM
 */
fun injectGlobal(css: CssBuilder) {
    GlobalStyles.sheet.scheduleToInject(css.toStyledCss().getCssRules(null))
    GlobalStyles.injectScheduled()
}

internal val isDevelopment by lazy {
    js("process.env.NODE_ENV !== 'production'") as Boolean
}

object GlobalStyles {
    internal var sheet: AbstractSheet
    internal var importSheet: AbstractSheet

    init {
        if (isDevelopment) {
            sheet = DevSheet(RuleType.REGULAR)
            importSheet = DevSheet(RuleType.IMPORT)
        } else {
            sheet = CSSOMSheet(RuleType.REGULAR)
            importSheet = CSSOMPersistentSheet(RuleType.IMPORT)
        }
    }

    private var incrementedClassName: Int = 0
        get() {
            field++
            return field
        }

    internal var styledClasses = InjectedCssHolder()
    internal val scheduledToDelete = LinkedHashSet<StyledCss>()

    private fun getInjectedClassName(css: StyledCss, classes: List<String>): ClassName {
        val info = styledClasses[css]
        return if (info != null) {
            // If we have the same CSS but with other static stylesheets we need to inject them
            val className = classes.toClassName()
            if (!info.associatedClasses.contains(className)) {
                info.associatedClasses.add(className)
                injectScheduled()
            }
            info.usedBy++
            info.className
        } else {
            scheduleToInjectClassName(css, classes).also {
                injectScheduled()
            }
        }
    }

    private fun scheduleToInjectClassName(css: StyledCss, classes: List<String>): ClassName {
        val className = "ksc-$incrementedClassName"
        val selector = ".$className"
        val rules = css.getCssRules(selector)
        val groupId = sheet.scheduleToInject(rules)

        // TODO we can store classnames as single string in StyledCss
        styledClasses[css] = UsedCssInfo(className, 1, groupId, mutableSetOf(classes.toClassName()))
        return className
    }

    /**
     * Inject all scheduled rules into the DOM and clear scheduled rules.
     * If the rule cannot be parsed by the browser, it gets thrown away.
     */
    fun injectScheduled() {
        sheet.injectScheduled()
        importSheet.injectScheduled()
    }

    internal val injectedStyleSheetRules = mutableMapOf<Selector, GroupId>()

    /**
     * Schedule CSS from [builder] for injection into the DOM with the corresponding [selector].
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(selector: Selector, builder: CssBuilder) {
        if (!injectedStyleSheetRules.contains(selector)) {
            val styled = builder.toStyledCss()
            val groupId = sheet.scheduleToInject(styled.getCssRules(selector))
            injectedStyleSheetRules[selector] = groupId
        }
    }

    fun removeInjectedStyleSheet(selectors: List<Selector>) {
        if (sheet is CSSOMSheet) {
            val sheet = sheet as CSSOMSheet
            val groups = selectors.mapNotNull { selector ->
                injectedStyleSheetRules[selector].also {
                    injectedStyleSheetRules.remove(selector)
                }
            }
            sheet.removeGroups(groups)
            sheet.requestClean { clean(sheet) }
        }
    }

    fun scheduleImports(imports: Iterable<Import>) {
        importSheet.scheduleToInject(imports.map { it.build() })
    }

    internal val keyframeByName = mutableMapOf<AnimationName, StyledKeyframes>()
    internal val injectedKeyframes = mutableMapOf<StyledKeyframes, UsedCssInfo>()

    /**
     * Schedule keyframes CSS in [builder] for injection into the DOM.
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(builder: KeyframesBuilder.() -> Unit): ClassName {
        val keyframes = KeyframesBuilder().apply(builder).toStyledKeyframes()
        val keyframe = injectedKeyframes[keyframes]
        return if (keyframe == null) {
            val keyframeName = "ksc-keyframe-$incrementedClassName"
            val css = keyframes.toString()
            val prefixes = listOf("@-webkit-keyframes", "@keyframes")
            val groupId = sheet.scheduleToInject(prefixes.map { prefix -> "$prefix $keyframeName { $css }" })
            injectedKeyframes[keyframes] = UsedCssInfo(keyframeName, 0, groupId)
            keyframeByName[keyframeName] = keyframes
            keyframeName
        } else keyframe.className
    }

    internal fun removeStyles(styledCss: StyledCss) {
        if (sheet !is CSSOMSheet) return
        val sheet = sheet as CSSOMSheet
        val info = styledClasses[styledCss] ?: throw IllegalStateException("Trying to remove non-existent css")
        info.usedBy--
        if (info.usedBy == 0) {
            scheduledToDelete.add(styledCss)
        }
        sheet.requestClean { clean(sheet) }
    }

    private fun clean(sheet: CSSOMSheet) {
        val toRemove = scheduledToDelete.map { css ->
            (styledClasses[css] ?: throw IllegalStateException("Non-existent css cleanup")).also {
                if (it.usedBy == 0) {
                    styledClasses.remove(css)
                }
            }
        }
        val removalGroups = toRemove.filter { it.usedBy == 0 }.map { it.groupId }
        sheet.removeGroups(removalGroups)
        scheduledToDelete.clear()
    }

    /**
     * @return pair of generated class name and a list of CSS class names, declared in [css].
     * If the CSS code for the [css] was not injected into the DOM previously, it is injected after function call.
     */
    internal fun getInjectedClassNames(styledCss: StyledCss, classes: List<String>): ClassName {
        return getInjectedClassName(styledCss, classes)
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
                "Over $maxStylesForElement were generated for $type. Consider using inline styles for frequently changed styles:\n\n" +
                        "styledDiv {\n" +
                        "    inlineStyles {\n" +
                        "        width = 100.px\n" +
                        "        backgroundColor = Color.blue\n" +
                        "    }\n" +
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
