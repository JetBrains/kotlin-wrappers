// Automatically generated - do not modify!

package web.geometry

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`DOMRectList`** interface represents a collection of DOMRect objects, typically used to hold the rectangles associated with a particular element, like bounding boxes returned by methods such as Element.getClientRects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList)
 */
external class DOMRectList
private constructor() :
    ArrayLike<DOMRect>,
    JsIterable<DOMRect> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/item)
     */
    fun item(index: Int): DOMRect?
}
