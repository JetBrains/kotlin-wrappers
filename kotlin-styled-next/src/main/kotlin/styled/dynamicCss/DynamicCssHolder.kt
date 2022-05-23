package styled.dynamicCss

import kotlinx.css.RuleSet
import styled.AbstractCssHolder
import styled.StyleSheet

/**
 * An implementation of the [AbstractCssHolder] to inject and provide styles without delegation features.
 * */
internal class DynamicCssHolder(sheet: StyleSheet, cssSuffix: String, vararg ruleSets: RuleSet) : AbstractCssHolder(sheet, *ruleSets) {
    private val className = "${sheet.name}-$cssSuffix"

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
