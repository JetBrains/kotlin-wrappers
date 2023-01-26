package styled

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

abstract class AbstractCssHolder(protected val sheet: StyleSheet, protected vararg val ruleSets: RuleSet) {
    protected val classNamesToInject = mutableSetOf<ClassName>()
    val css by lazy {
        CssBuilder(allowClasses = false).apply {
            this@AbstractCssHolder.ruleSets.map { it() }
        }
    }

    fun scheduleToInject() {
        classNamesToInject.forEach { className ->
            scheduleToInject(className)
        }
    }

    fun scheduleToInject(className: String) {
        if (classNamesToInject.contains(className)) {
            GlobalStyles.scheduleToInject(".$className", css)
        }
    }

    fun removeInjected() {
        GlobalStyles.removeInjectedStyleSheet(classNamesToInject.map { className -> ".$className" })
    }
}


class CssHolder(sheet: StyleSheet, vararg ruleSets: RuleSet) : AbstractCssHolder(sheet, *ruleSets) {
    /**
     * Used to be able to create styleSheets with the same name.
     * Time complexity is O(n), where n is the number of css blocks with the same classname (styleSheet name + property name) and different CSS names, which were injected before this one
     */
    private fun updateClassnameIfClashes(className: ClassName): ClassName {
        var newClassname = className
        var counter = 0
        while (GlobalStyles.usedStyleSheet.contains(".${newClassname}") && GlobalStyles.usedStyleSheet[".${newClassname}"] != sheet) {
            newClassname = className + counter
            counter++
        }
        return newClassname
    }

    operator fun provideDelegate(thisRef: Any?, providingProperty: KProperty<*>): ReadOnlyProperty<Any?, RuleSet> {
        val className = updateClassnameIfClashes(sheet.getClassName(providingProperty))
        classNamesToInject.add(className)
        GlobalStyles.usedStyleSheet[".$className"] = sheet
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
