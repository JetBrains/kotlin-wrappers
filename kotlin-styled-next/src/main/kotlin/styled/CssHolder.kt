package styled

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

abstract class AbstractCssHolder(protected val sheet: StyleSheet, protected vararg val ruleSets: RuleSet) {
    protected val classNamesToInject = mutableMapOf<ClassName, Boolean>()
    val css by lazy {
        CssBuilder(allowClasses = false).apply {
            this@AbstractCssHolder.ruleSets.map { it() }
        }
    }

    fun scheduleToInject() {
        classNamesToInject.keys.forEach { className ->
            scheduleToInject(className)
        }
    }

    fun scheduleToInject(className: String) {
        if (classNamesToInject[className] == true) {
            GlobalStyles.scheduleToInject(".$className", css)
        }
    }

    fun removeInjected() {
        GlobalStyles.removeInjectedStyleSheet(classNamesToInject.map { (className, _) -> ".$className" })
    }
}

class CssHolder(sheet: StyleSheet, vararg ruleSets: RuleSet) : AbstractCssHolder(sheet, *ruleSets) {
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
