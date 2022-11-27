// Automatically generated - do not modify!

package dom.svg

import js.core.ArrayLike

sealed external class SVGNumberList :
    ArrayLike<SVGNumber> {
    val numberOfItems: Int
    fun appendItem(newItem: SVGNumber): SVGNumber
    fun clear()
    fun getItem(index: Int): SVGNumber
    fun initialize(newItem: SVGNumber): SVGNumber
    fun insertItemBefore(
        newItem: SVGNumber,
        index: Int,
    ): SVGNumber

    fun removeItem(index: Int): SVGNumber
    fun replaceItem(
        newItem: SVGNumber,
        index: Int,
    ): SVGNumber
}
