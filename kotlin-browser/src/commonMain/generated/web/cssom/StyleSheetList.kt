// Automatically generated - do not modify!

package web.cssom

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * A list of StyleSheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList)
 */
external class StyleSheetList
private constructor() :
    ArrayLike<CSSStyleSheet>,
    JsIterable<CSSStyleSheet> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/item)
     */
    fun item(index: Int): CSSStyleSheet?
}
