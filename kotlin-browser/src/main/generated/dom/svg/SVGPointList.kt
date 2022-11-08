// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMPoint
import kotlinx.js.ArrayLike

sealed external class SVGPointList :
    ArrayLike<DOMPoint> {
    val numberOfItems: Int
    fun appendItem(newItem: DOMPoint): DOMPoint
    fun clear()
    fun getItem(index: Number): DOMPoint
    fun initialize(newItem: DOMPoint): DOMPoint
    fun insertItemBefore(
        newItem: DOMPoint,
        index: Number,
    ): DOMPoint

    fun removeItem(index: Number): DOMPoint
    fun replaceItem(
        newItem: DOMPoint,
        index: Number,
    ): DOMPoint
}
