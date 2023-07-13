// Automatically generated - do not modify!

package web.svg

import js.core.ArrayLike
import js.iterable.JsIterable
import web.geometry.DOMPoint

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList) */
sealed external class SVGPointList :
    ArrayLike<DOMPoint>,
    JsIterable<DOMPoint> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/numberOfItems) */
    val numberOfItems: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/appendItem) */
    fun appendItem(newItem: DOMPoint): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/clear) */
    fun clear()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/getItem) */
    fun getItem(index: Int): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize) */
    fun initialize(newItem: DOMPoint): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore) */
    fun insertItemBefore(
        newItem: DOMPoint,
        index: Int,
    ): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem) */
    fun removeItem(index: Int): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem) */
    fun replaceItem(
        newItem: DOMPoint,
        index: Int,
    ): DOMPoint
}
