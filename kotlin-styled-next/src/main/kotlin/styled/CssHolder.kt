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
    private fun updateClassnameIfClashes(className: ClassName): ClassName {
        var newClassname = className
        var counter = 0
        while ((GlobalStyles.usedStyleSheet.contains(".${newClassname}") && GlobalStyles.usedStyleSheet[".${newClassname}"] != css)
            || (GlobalStyles.injectedStyleSheetRules.contains(".${newClassname}") && GlobalStyles.styledClasses[css]?.className != newClassname)
        ) {
            newClassname = className + counter
            counter++
        }
        return newClassname
    }

    operator fun provideDelegate(thisRef: Any?, providingProperty: KProperty<*>): ReadOnlyProperty<Any?, RuleSet> {
        val className = updateClassnameIfClashes(sheet.getClassName(providingProperty))
        classNamesToInject.add(className)
        GlobalStyles.usedStyleSheet[".$className"] = css
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
