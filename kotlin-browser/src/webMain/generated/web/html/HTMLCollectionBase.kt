// Automatically generated - do not modify!

package web.html

import js.array.ArrayLike
import js.iterable.JsIterable
import web.dom.Element

/**
 * The **`HTMLCollection`** interface represents a generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection)
 */
external interface HTMLCollectionBase<T : Element> :
    ArrayLike<T>,
    JsIterable<T> {
    /**
     * The HTMLCollection method **`item()`** returns the element located at the specified offset into the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/item)
     */
    fun item(index: Int): T?
}
