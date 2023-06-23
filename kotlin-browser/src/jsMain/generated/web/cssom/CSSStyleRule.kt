// Automatically generated - do not modify!

package web.cssom

/**
 * CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule)
 */
sealed external class CSSStyleRule :
    CSSRule {
    val cssRules: CSSRuleList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/selectorText) */
    var selectorText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/style) */
    val style: CSSStyleDeclaration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSStyleRule/styleMap) */
    val styleMap: StylePropertyMap
    fun deleteRule(index: Int)
    fun insertRule(
        rule: String,
        index: Int = definedExternally,
    ): Number
}
