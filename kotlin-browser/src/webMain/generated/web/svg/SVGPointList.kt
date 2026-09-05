// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SVGPointList`** interface represents a list of DOMPoint objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList)
 */
open external class SVGPointList
private constructor() :
    ArrayLike<SVGPoint>,
    JsIterable.Mixin<SVGPoint> {
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
    fun appendItem(newItem: SVGPoint): SVGPoint

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
    fun getItem(index: Int): SVGPoint

    /**
     * The **`initialize()`** method of the SVGPointList interface clears the list then adds a single new DOMPoint object to the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize)
     */
    fun initialize(newItem: SVGPoint): SVGPoint

    /**
     * The **`insertItemBefore()`** method of the SVGPointList interface inserts a DOMPoint before another item in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: SVGPoint,
        index: Int,
    ): SVGPoint

    /**
     * The **`removeItem()`** method of the SVGPointList interface removes a DOMPoint from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem)
     */
    fun removeItem(index: Int): SVGPoint

    /**
     * The **`replaceItem()`** method of the SVGPointList interface replaces a DOMPoint in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGPoint,
        index: Int,
    ): SVGPoint
}
