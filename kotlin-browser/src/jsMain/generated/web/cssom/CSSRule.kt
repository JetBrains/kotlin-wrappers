// Automatically generated - do not modify!

package web.cssom

/**
 * A single CSS rule. There are several types of rules, listed in the Type constants section below.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule)
 */
sealed external class CSSRule {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/cssText)
     */
    var cssText: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentRule)
     */
    val parentRule: CSSRule?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentStyleSheet)
     */
    val parentStyleSheet: CSSStyleSheet?
}
