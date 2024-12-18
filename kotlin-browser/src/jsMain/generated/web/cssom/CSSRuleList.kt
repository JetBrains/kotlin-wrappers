// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList)
 */
external class CSSRuleList
private constructor() :
    ArrayLike<CSSRule>,
    JsIterable<CSSRule> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/item)
     */
    fun item(index: Int): CSSRule?
}
