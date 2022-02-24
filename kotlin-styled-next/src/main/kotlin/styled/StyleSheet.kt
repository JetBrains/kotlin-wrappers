package styled

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet
import kotlin.js.Promise
import kotlin.properties.ReadOnlyProperty
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
 * Default value is the object name.
 *
 * If [isStatic] property is set to true, a static, human-readable class selector will be created for every property,
 * making referencing from other stylesheets possible. Generated class names will be used otherwise.
 *
 * [imports] are the URLs (relative or absolute) of CSS files that will be added to the DOM with the first use of [StyleSheet].
 */
open class StyleSheet(
    name: String? = null,
    val isStatic: Boolean = false,
    internal var imports: List<Import> = emptyList(),
) {
    var name: String = name
        ?: this::class.simpleName
        ?: this::class.js.name.replace("$", "").replace(".", "").also {
            console.warn("Anonymous stylesheet without classname: $it")
        }
    private val holders: MutableList<CssHolder> = mutableListOf()

    constructor(name: String, parent: StyleSheet, isStatic: Boolean = false) : this(parent.name + "-" + name, isStatic)

    fun css(vararg parents: RuleSet, builder: RuleSet) =
        CssHolder(this, *parents, builder)
            .also { addCssHolder(it) }

    internal fun addCssHolder(holder: CssHolder) {
        holders.add(holder)
    }

    fun inject() {
        scheduleToInject()
        GlobalStyles.injectScheduled()
    }

    internal fun scheduleImports() {
        if (imports.isNotEmpty()) {
            GlobalStyles.scheduleImports(imports)
            imports = emptyList()
        }
    }

    private fun scheduleToInject() {
        scheduleImports()
        holders.forEach {
            it.scheduleToInject()
        }
    }

    fun scheduleToInject(className: String) {
        holders.forEach {
            it.scheduleToInject(className)
        }
    }

    fun removeInjected() {
        holders.forEach { it.removeInjected() }
    }
}

class CssHolder(private val sheet: StyleSheet, private vararg val ruleSets: RuleSet) {
    private val classNamesToInject = mutableMapOf<ClassName, Boolean>()

    val css by lazy {
        CssBuilder(allowClasses = false).apply {
            this@CssHolder.ruleSets.map { it() }
        }
    }

    fun scheduleToInject(className: String) {
        if (classNamesToInject[className] == true) {
            classNamesToInject[className] = false
            GlobalStyles.scheduleToInject(".$className", css)
        }
    }

    fun removeInjected() {
        GlobalStyles.removeInjectedStyleSheet(classNamesToInject.map { (className, _) -> ".$className" })
    }

    fun scheduleToInject() {
        classNamesToInject.keys.forEach { className ->
            scheduleToInject(className)
        }
    }

    operator fun provideDelegate(thisRef: Any?, providingProperty: KProperty<*>): ReadOnlyProperty<Any?, RuleSet> {
        val className = sheet.getClassName(providingProperty)
        classNamesToInject[className] = true
        return ReadOnlyProperty { _, property ->
            {
                sheet.scheduleImports()
                if (sheet.isStatic) {
                    scheduleToInject(className)
                    +className
                }
                if (!sheet.isStatic || !allowClasses || isHolder) {
                    styleName.add(sheet.getClassName(property))
                    ruleSets.forEach { it() }
                }
            }
        }
    }
}

fun <T : StyleSheet> T.getClassName(getClass: (T) -> KProperty0<RuleSet>): String {
    return getClassName(getClass(this)).also { className ->
        Promise.resolve(Unit).then { scheduleToInject(className); GlobalStyles.injectScheduled() }
    }
}

private fun StyleSheet.getClassName(property: KProperty<*>): String {
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
