// Automatically generated - do not modify!

package web.geometry

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`DOMRectList`** interface represents a collection of DOMRect objects, typically used to hold the rectangles associated with a particular element, like bounding boxes returned by methods such as getClientRects(). It provides access to each rectangle in the list via its index, along with a length property that indicates the total number of rectangles in the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList)
 */
open external class DOMRectList
private constructor() :
    ArrayLike<DOMRect>,
    JsIterable<DOMRect> {
    /**
     * The read-only **`length`** property of the DOMRectList interface returns the number of DOMRect objects in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/length)
     */
    override val length: Int

    /**
     * The DOMRectList method **`item()`** returns the DOMRect at the specified index within the list, or null if the index is out of range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/item)
     */
    fun item(index: Int): DOMRect?
}
