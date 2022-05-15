package styled

import kotlinx.css.CssBuilder
import kotlinx.css.RuleSet

/**
 * A variation of the [CssHolder] to inject and provide styles without delegation features.
 * */
internal class DynamicCssHolder(private val sheet: StyleSheet, cssSuffix: String, private vararg val ruleSets: RuleSet) {
    private val classNamesToInject = mutableMapOf<ClassName, Boolean>()
    private val className = "${sheet.name}-$cssSuffix"

    private val css: CssBuilder by lazy {
        CssBuilder(allowClasses = false).apply {
            ruleSets.map { it() }
        }
    }

    private fun scheduleToInject(className: String) {
        if (classNamesToInject[className] == true) {
            GlobalStyles.scheduleToInject(".$className", css)
        }
    }

    /**
     * Contains the initialization part of the delegate from the [CssHolder].
     * */
    internal fun markToInject() {
        classNamesToInject[className] = true
    }

    /**
     * Contains the property providing part from the [CssHolder].
     * */
    internal fun provideRuleSet(): RuleSet = {
        sheet.scheduleImports()
        if (sheet.isStatic) {
            scheduleToInject(className)
            +className
        }
        if (!sheet.isStatic || !allowClasses || isHolder) {
            styleName.add(className)
            ruleSets.forEach { it() }
        }
    }

}
