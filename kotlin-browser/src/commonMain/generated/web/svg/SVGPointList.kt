// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable
import web.geometry.DOMPoint

/**
 * The **`SVGPointList`** interface represents a list of DOMPoint objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList)
 */
external class SVGPointList
private constructor() :
    ArrayLike<DOMPoint>,
    JsIterable<DOMPoint> {
    /**
     * The **`length`** read-only property of the SVGPointList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** read-only property of the SVGPointList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGPointList interface adds a DOMPoint to the end of the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/appendItem)
     */
    fun appendItem(newItem: DOMPoint): DOMPoint

    /**
     * The **`clear()`** method of the SVGPointList interface removes all items from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/clear)
     */
    fun clear()

    /**
     * The **`getItem()`** method of the SVGPointList interface gets one item from the list at the specified index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/getItem)
     */
    fun getItem(index: Int): DOMPoint

    /**
     * The **`initialize()`** method of the SVGPointList interface clears the list then adds a single new DOMPoint object to the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize)
     */
    fun initialize(newItem: DOMPoint): DOMPoint

    /**
     * The **`insertItemBefore()`** method of the SVGPointList interface inserts a DOMPoint before another item in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: DOMPoint,
        index: Int,
    ): DOMPoint

    /**
     * The **`removeItem()`** method of the SVGPointList interface removes a DOMPoint from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem)
     */
    fun removeItem(index: Int): DOMPoint

    /**
     * The **`replaceItem()`** method of the SVGPointList interface replaces a DOMPoint in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem)
     */
    fun replaceItem(
        newItem: DOMPoint,
        index: Int,
    ): DOMPoint
}
