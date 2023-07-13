// Automatically generated - do not modify!

package web.cssom

import js.core.ArrayLike
import js.iterable.JsIterable

/**
 * A list of StyleSheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList)
 */
sealed external class StyleSheetList :
    ArrayLike<CSSStyleSheet>,
    JsIterable<CSSStyleSheet> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/item) */
    fun item(index: Int): CSSStyleSheet?
}
