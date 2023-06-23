// Automatically generated - do not modify!

package web.cssom

/**
 * CSSPageRule is an interface representing a single CSS @page rule. It implements the CSSRule interface with a type value of 6 (CSSRule.PAGE_RULE).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule)
 */
sealed external class CSSPageRule :
    CSSGroupingRule {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/selectorText) */
    var selectorText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPageRule/style) */
    val style: CSSStyleDeclaration
}
