// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.core.JsIterable

/**
 * A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList)
 */
sealed external class CSSRuleList :
    ArrayLike<CSSRule>,
    JsIterable<CSSRule> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/item) */
    fun item(index: Int): CSSRule?
}
