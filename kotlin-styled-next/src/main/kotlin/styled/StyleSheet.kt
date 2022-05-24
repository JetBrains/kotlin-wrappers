package styled

import kotlinx.css.CssBuilder
import kotlinx.css.CssValue
import kotlinx.css.RuleSet
import org.w3c.dom.css.CSS
import styled.dynamicCss.DynamicCssDelegate
import styled.dynamicCss.DynamicCssHolder
import kotlin.js.Promise
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

class Import(private val url: String, private val types: List<String> = listOf()) {
    fun build(): String {
        return "@import $url" + types.joinToString(prefix = " ") + ";"
    }
}

/**
 * Represents a reusable piece of CSS code
 *
 * [name] is the stylesheet identifier. CSS class names are generated using a combination of [name] and property name.
 * If not specified, object name obtained via reflection is used instead.
 *
 * If [isStatic] property is set to true, a static, human-readable class selector will be created for every property,
 * making referencing from other stylesheets possible. Generated class names will be used otherwise.
 *
 * [imports] are the URLs (relative or absolute) of CSS files that will be added to the DOM with the first use of [StyleSheet].
 */
open class StyleSheet(
    name: String? = null,
    val isStatic: Boolean = true,
    internal var imports: List<Import> = emptyList(),
) {
    val name: String = name
        ?: this::class.simpleName
        ?: this::class.js.name.replace("$", "").replace(".", "").also {
            console.warn("Style sheet with no name specified: $it")
        }
    private val holders: MutableList<CssHolder> = mutableListOf()

    /** Keeps all holders providing dynamic styles - the holders are cached by their CSS suffixes. */
    private val dynamicHolders = mutableMapOf<String, DynamicCssHolder>()

    constructor(name: String, parent: StyleSheet, isStatic: Boolean = true) : this(parent.name + "-" + name, isStatic)

    fun css(vararg parents: RuleSet, builder: RuleSet) =
        CssHolder(this, *parents, builder)
            .also { addCssHolder(it) }

    /**
     * Declares properties with dynamic styles according to provided arguments.
     *
     * @param builder Describes how to prepare a style according to the current argument.
     *
     * @return An instance of the [DynamicCssDelegate] allowing the target property to invoke required styles.
     * */
    fun <T : Any> dynamicCss(builder: CssBuilder.(T) -> Unit) = DynamicCssDelegate(this, builder)

    internal fun addCssHolder(holder: CssHolder) {
        holders.add(holder)
    }

    fun inject() {
        scheduleToInject()
        GlobalStyles.injectScheduled()
    }

    /**
     * Creates a new or uses an already cached [RuleSet] corresponding to the provided [argument].
     *
     * @param staticCssSuffix Some unique static (stays the same even if the [argument] changes) name for a style:
     *                        usually a property name.
     * @param builder Describes how to prepare styles for the particular [argument].
     * @param argument Some kind of seed and identifier to prepare a [RuleSet].
     *
     * @return A prepared [RuleSet] ready to be used.
     * */
    internal fun <T : Any> prepareCachedRuleSet(
        staticCssSuffix: String,
        builder: CssBuilder.(T) -> Unit,
        argument: T
    ): RuleSet {
        val fullCssSuffix = "$staticCssSuffix-${argument.extractCssSuffix()}"
        return dynamicHolders.getOrPut(fullCssSuffix) {
            DynamicCssHolder(this, fullCssSuffix, { builder.invoke(this, argument) })
                .also { it.markToInject() }
        }.provideRuleSet()
    }

    internal fun scheduleImports() {
        if (imports.isNotEmpty()) {
            GlobalStyles.scheduleImports(imports)
            imports = emptyList()
        }
    }

    private fun scheduleToInject() {
        scheduleImports()
        (holders + dynamicHolders.values).forEach {
            it.scheduleToInject()
        }
    }

    fun scheduleToInject(className: String) {
        (holders + dynamicHolders.values).forEach {
            it.scheduleToInject(className)
        }
    }

    fun removeInjected() {
        (holders + dynamicHolders.values).forEach { it.removeInjected() }
    }
}

fun <T : StyleSheet> T.getClassName(getClass: (T) -> KProperty0<RuleSet>): String {
    return getClassName(getClass(this)).also { className ->
        Promise.resolve(Unit).then {
            scheduleToInject(className)
            GlobalStyles.injectScheduled()
        }
    }
}

internal fun StyleSheet.getClassName(property: KProperty<*>): String {
    return "$name-${property.name}"
}

fun <T : StyleSheet> T.getClassSelector(getClass: (T) -> KProperty0<RuleSet>): String {
    return ".${getClassName(getClass)}"
}

/**
 * Use this function to assign a CSS class without any properties to an element
 */
fun StyleSheet.cssMarker() =
    CssHolder(this, {})
        .also { addCssHolder(it) }

private fun String.revampCssSuffix(): String = CSS.escape(this.replace(" ", "-"))

private fun Any.extractCssSuffix(): String = when (this) {
    is CssValue -> value.revampCssSuffix()
    is HasCssSuffix -> cssSuffix.revampCssSuffix()
    is KProperty<*> -> name.revampCssSuffix()
    is Enum<*> -> name.revampCssSuffix()
    is String -> revampCssSuffix()
    is Boolean -> toString()
    is Number -> toString().replace(".", "-")
    else -> throw IllegalArgumentException("type is unsupported")
}
