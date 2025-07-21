// Automatically generated - do not modify!

package web.cssom

import kotlin.js.definedExternally

/**
 * The **`CSSGroupingRule`** interface of the CSS Object Model represents any CSS at-rule that contains other rules nested within it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule)
 */
open external class CSSGroupingRule
private constructor() :
    CSSRule {
    /**
     * The **`cssRules`** property of the CSSGroupingRule interface returns a CSSRuleList containing a collection of CSSRule objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * The **`deleteRule()`** method of the CSSGroupingRule interface removes a CSS rule from a list of child CSS rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/deleteRule)
     */
    fun deleteRule(index: Int)

    /**
     * The **`insertRule()`** method of the CSSGroupingRule interface adds a new CSS rule to a list of CSS rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/insertRule)
     */
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Int
}
