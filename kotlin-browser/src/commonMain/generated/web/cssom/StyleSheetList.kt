// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The `StyleSheetList` interface represents a list of CSSStyleSheet objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList)
 */
open external class StyleSheetList
private constructor() :
    ArrayLike<CSSStyleSheet>,
    JsIterable<CSSStyleSheet> {
    /**
     * The **`length`** read-only property of the StyleSheetList interface returns the number of CSSStyleSheet objects in the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/length)
     */
    override val length: Int

    /**
     * The **`item()`** method of the StyleSheetList interface returns a single CSSStyleSheet object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/item)
     */
    fun item(index: Int): CSSStyleSheet?
}
