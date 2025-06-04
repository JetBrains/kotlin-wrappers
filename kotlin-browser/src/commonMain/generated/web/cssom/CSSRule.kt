// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSRule`** interface represents a single CSS rule.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule)
 */
open external class CSSRule
private constructor() {
    /**
     * The **`cssText`** property of the CSSRule interface returns the actual text of a CSSStyleSheet style-rule.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/cssText)
     */
    var cssText: String

    /**
     * The **`parentRule`** property of the CSSRule interface returns the containing rule of the current rule if this exists, or otherwise returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentRule)
     */
    val parentRule: CSSRule?

    /**
     * The **`parentStyleSheet`** property of the the current rule is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentStyleSheet)
     */
    val parentStyleSheet: CSSStyleSheet?
}
