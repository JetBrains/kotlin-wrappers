// Automatically generated - do not modify!

package web.html

import js.core.ArrayLike
import js.core.JsIterable
import web.dom.Element

/**
 * A generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection)
 */
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
