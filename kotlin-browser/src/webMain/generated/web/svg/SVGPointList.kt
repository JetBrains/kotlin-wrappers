// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable
import web.errors.DOMExceptionType.IndexSizeError
import web.errors.DOMExceptionType.NoModificationAllowedError
import web.errors.JsThrows

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
    @JsThrows(NoModificationAllowedError::class)
    fun appendItem(newItem: SVGPoint): SVGPoint

    /**
     * The **`clear()`** method of the SVGPointList interface removes all items from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/clear)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun clear()

    /**
     * The **`getItem()`** method of the SVGPointList interface gets one item from the list at the specified index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/getItem)
     */
    @JsThrows(IndexSizeError::class)
    fun getItem(index: Int): SVGPoint

    /**
     * The **`initialize()`** method of the SVGPointList interface clears the list then adds a single new DOMPoint object to the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun initialize(newItem: SVGPoint): SVGPoint

    /**
     * The **`insertItemBefore()`** method of the SVGPointList interface inserts a DOMPoint before another item in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun insertItemBefore(
        newItem: SVGPoint,
        index: Int,
    ): SVGPoint

    /**
     * The **`removeItem()`** method of the SVGPointList interface removes a DOMPoint from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem)
     */
    @JsThrows(IndexSizeError::class)
    @JsThrows(NoModificationAllowedError::class)
    fun removeItem(index: Int): SVGPoint

    /**
     * The **`replaceItem()`** method of the SVGPointList interface replaces a DOMPoint in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem)
     */
    @JsThrows(IndexSizeError::class)
    @JsThrows(NoModificationAllowedError::class)
    fun replaceItem(
        newItem: SVGPoint,
        index: Int,
    ): SVGPoint
}
