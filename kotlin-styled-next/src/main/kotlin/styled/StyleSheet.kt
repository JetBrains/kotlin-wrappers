package styled

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

class Import(private val url: String, private val types: List<String> = listOf()) {
    fun build(): String {
        return "@import $url" + types.joinToString(prefix = " ") + ";"
    }
}

/**
 * Represents reusable piece of CSS code
 * [name] is the identifier of the stylesheet. From the stylesheet's [name] and property name combination CSS class is generated
 * If [isStatic] property is set to true, the separate class rule will be created for every property.
 * CSS will be added to each component's generated rule otherwise.
 * [imports] are the names of urls or css files, which will be added to the DOM with the first [StyleSheet] usage
 */
open class StyleSheet(var name: String, val isStatic: Boolean = false, internal var imports: List<Import> = emptyList()) {
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

    internal fun injectImports() {
        if (imports.isNotEmpty()) {
            GlobalStyles.scheduleImports(imports)
            imports = emptyList()
        }
    }

    fun scheduleToInject() {
        injectImports()
        holders.forEach {
            it.scheduleToInject()
        }
    }
}

class CssHolder(private val sheet: StyleSheet, internal vararg val ruleSets: RuleSet) {
    private val classNamesToInject = mutableMapOf<ClassName, Boolean>()

    val css by lazy {
        CssBuilder(allowClasses = false).apply {
            this@CssHolder.ruleSets.map { it() }
        }
    }

    private fun scheduleToInject(className: String) {
        if (classNamesToInject[className] == true) {
            classNamesToInject[className] = false
            GlobalStyles.scheduleToInject(".$className", css)
        }
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
                sheet.injectImports()
                if (sheet.isStatic) {
                    scheduleToInject(className)
                    classes.add(className)
                }
                if (!sheet.isStatic || !allowClasses) {
                    styleName.add(sheet.getClassName(property))
                    ruleSets.forEach { it() }
                }
            }
        }
    }
}

fun <T : StyleSheet> T.getClassName(getClass: (T) -> KProperty0<RuleSet>): String {
    return getClassName(getClass(this))
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
