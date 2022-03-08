package styled

import kotlinx.css.CssBuilder
import kotlinx.css.properties.KeyframesBuilder
import styled.sheets.*
import kotlin.collections.*

data class UsedCssInfo(
    val className: ClassName,
    var usedBy: Int,
    val groupId: Int,
)

data class CssInfo(
    val isFresh: Boolean,
    val className: ClassName,
)

internal typealias InjectedCssHolder = LinkedHashMap<CssBuilder, UsedCssInfo>

/**
 * Inject CSS rules defined in [css] into the DOM
 */
fun injectGlobal(css: CssBuilder) {
    GlobalStyles.sheet.scheduleToInject(css.getCssRules(null))
    GlobalStyles.injectScheduled()
}

@Suppress("NOTHING_TO_INLINE")
internal inline fun isDevelopment() = js("process.env.NODE_ENV !== 'production'") as Boolean

object GlobalStyles {
    internal var sheet: AbstractSheet
    internal var importSheet: AbstractSheet

    init {
        if (isDevelopment() && GlobalCssAccess.isDevSheet()) {
            sheet = DevSheet(RuleType.REGULAR)
            importSheet = DevSheet(RuleType.IMPORT)
        } else {
            sheet = CSSOMSheet(RuleType.REGULAR)
            importSheet = CSSOMPersistentSheet(RuleType.IMPORT)
        }
        if (isDevelopment()) {
            GlobalCssAccess.setupCssHelperFunctions()
        }
    }

    fun useDevSheet(isDev: Boolean = true) {
        GlobalCssAccess.useDevSheet(isDev)
    }

    internal var incrementedClassName: Int = 0
        get() = field++

    internal var styledClasses = InjectedCssHolder()
    internal val scheduledToDelete = LinkedHashSet<CssBuilder>()

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
     * Schedule CSS from [css] for injection into the DOM with the corresponding [selector].
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(selector: Selector, css: CssBuilder) {
        if (!injectedStyleSheetRules.contains(selector)) {
            val groupId = sheet.scheduleToInject(css.getCssRules(selector))
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
        }
    }

    fun scheduleImports(imports: Iterable<Import>) {
        importSheet.scheduleToInject(imports.map { it.build() })
    }

    internal val keyframeByName = mutableMapOf<AnimationName, KeyframesBuilder>()
    internal val injectedKeyframes = mutableMapOf<KeyframesBuilder, UsedCssInfo>()

    /**
     * Schedule keyframes CSS in [builder] for injection into the DOM.
     * They will be injected when the [injectScheduled] function is called the next time.
     */
    fun scheduleToInject(builder: KeyframesBuilder.() -> Unit): ClassName {
        val keyframes = KeyframesBuilder().apply(builder)
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

    internal fun removeStyles(css: CssBuilder) {
        val cssomSheet = sheet
        if (cssomSheet !is CSSOMSheet) return
        val info = styledClasses[css] ?: throw IllegalStateException("Trying to remove non-existent css")
        info.usedBy--
        if (info.usedBy == 0) {
            scheduledToDelete.add(css)
        }
        cssomSheet.requestClean { clean(cssomSheet) }
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
     * @return CssInfo, consisting of a flag showing whether [css] has been injected, and a generated a class name
     */
    internal fun getInjectedClassNames(css: CssBuilder): CssInfo {
        val info = styledClasses[css]
        return if (info != null) {
            info.usedBy++
            CssInfo(isFresh = false, info.className)
        } else {
            val className = "ksc-$incrementedClassName"
            val selector = ".$className"
            val rules = css.getCssRules(selector)
            val groupId = sheet.scheduleToInject(rules)
            styledClasses[css] = UsedCssInfo(className, 1, groupId)
            CssInfo(isFresh = true, className)
        }
    }
}
