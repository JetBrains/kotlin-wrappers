// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * A `CSSRuleList` represents an ordered collection of read-only CSSRule objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList)
 */
open external class CSSRuleList
private constructor() :
    ArrayLike<CSSRule>,
    JsIterable<CSSRule> {
    /**
     * The **`length`** property of the CSSRuleList interface returns the number of CSSRule objects in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/length)
     */
    override val length: Int

    /**
     * The **`item()`** method of the CSSRuleList interface returns the CSSRule object at the specified `index` or `null` if the specified `index` doesn't exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/item)
     */
    fun item(index: Int): CSSRule?
}
