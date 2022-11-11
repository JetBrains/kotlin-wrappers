// Automatically generated - do not modify!

package dom.svg

import kotlinx.js.ArrayLike

sealed external class SVGLengthList :
    ArrayLike<SVGLength> {
    val numberOfItems: Int
    fun appendItem(newItem: SVGLength): SVGLength
    fun clear()
    fun getItem(index: Int): SVGLength
    fun initialize(newItem: SVGLength): SVGLength
    fun insertItemBefore(
        newItem: SVGLength,
        index: Int,
    ): SVGLength

    fun removeItem(index: Int): SVGLength
    fun replaceItem(
        newItem: SVGLength,
        index: Int,
    ): SVGLength
}
