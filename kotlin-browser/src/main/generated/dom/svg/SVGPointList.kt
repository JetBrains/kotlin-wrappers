// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMPoint

sealed external class SVGPointList {
    val length: Int
    val numberOfItems: Number
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
    // [index: number]: DOMPoint
}
