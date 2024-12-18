// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable
import web.geometry.DOMPoint

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList)
 */
external class SVGPointList
private constructor() :
    ArrayLike<DOMPoint>,
    JsIterable<DOMPoint> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/length)
     */
    val length: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/numberOfItems)
     */
    val numberOfItems: UInt

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/appendItem)
     */
    fun appendItem(newItem: DOMPoint): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/clear)
     */
    fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/getItem)
     */
    fun getItem(index: UInt): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize)
     */
    fun initialize(newItem: DOMPoint): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: DOMPoint,
        index: UInt,
    ): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem)
     */
    fun removeItem(index: UInt): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem)
     */
    fun replaceItem(
        newItem: DOMPoint,
        index: UInt,
    ): DOMPoint
}
