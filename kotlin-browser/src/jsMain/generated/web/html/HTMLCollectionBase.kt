// Automatically generated - do not modify!

package web.html

import js.core.ArrayLike
import js.core.JsIterable
import web.dom.Element

sealed external interface HTMLCollectionBase<T : Element> :
    ArrayLike<T>,
    JsIterable<T> {
    /**
     * Retrieves an object from various collections.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/item)
     */
    fun item(index: Int): T?
}
