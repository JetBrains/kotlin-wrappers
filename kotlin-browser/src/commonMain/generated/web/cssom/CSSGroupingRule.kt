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
     * The **`cssRules`** property of the a collection of CSSRule objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/cssRules)
     */
    val cssRules: CSSRuleList

    /**
     * The **`deleteRule()`** method of the rules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/deleteRule)
     */
    fun deleteRule(index: Int)

    /**
     * The **`insertRule()`** method of the ```js-nolint insertRule(rule) insertRule(rule, index) ``` - `rule` - : A string - `index` MISSING: optional_inline] - : An optional index at which to insert the rule; defaults to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/insertRule)
     */
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Int
}
