// Automatically generated - do not modify!

package web.svg

import js.core.ArrayLike
import js.core.JsIterable
import web.geometry.DOMPoint

sealed external class SVGPointList :
    ArrayLike<DOMPoint>,
    JsIterable<DOMPoint> {
    val numberOfItems: Int
    fun appendItem(newItem: DOMPoint): DOMPoint
    fun clear()
    fun getItem(index: Int): DOMPoint
    fun initialize(newItem: DOMPoint): DOMPoint
    fun insertItemBefore(
        newItem: DOMPoint,
        index: Int,
    ): DOMPoint

    fun removeItem(index: Int): DOMPoint
    fun replaceItem(
        newItem: DOMPoint,
        index: Int,
    ): DOMPoint
}
