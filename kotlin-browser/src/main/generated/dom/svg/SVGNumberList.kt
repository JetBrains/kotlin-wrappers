// Automatically generated - do not modify!

package dom.svg

import kotlinx.js.ArrayLike

sealed external class SVGNumberList :
    ArrayLike<SVGNumber> {
    val numberOfItems: Int
    fun appendItem(newItem: SVGNumber): SVGNumber
    fun clear()
    fun getItem(index: Number): SVGNumber
    fun initialize(newItem: SVGNumber): SVGNumber
    fun insertItemBefore(
        newItem: SVGNumber,
        index: Number,
    ): SVGNumber

    fun removeItem(index: Number): SVGNumber
    fun replaceItem(
        newItem: SVGNumber,
        index: Number,
    ): SVGNumber
}
