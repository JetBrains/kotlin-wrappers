// Automatically generated - do not modify!

package web.cssom

/**
 * Any CSS at-rule that contains other rules nested within it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule)
 */
sealed external class CSSGroupingRule :
    CSSRule {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/cssRules) */
    val cssRules: CSSRuleList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/deleteRule) */
    fun deleteRule(index: Int)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSGroupingRule/insertRule) */
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Number
}
