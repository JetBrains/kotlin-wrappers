// Automatically generated - do not modify!

package dom.svg

import kotlinx.js.ArrayLike

sealed external class SVGLengthList :
    ArrayLike<SVGLength> {
    val numberOfItems: Int
    fun appendItem(newItem: SVGLength): SVGLength
    fun clear()
    fun getItem(index: Number): SVGLength
    fun initialize(newItem: SVGLength): SVGLength
    fun insertItemBefore(
        newItem: SVGLength,
        index: Number,
    ): SVGLength

    fun removeItem(index: Number): SVGLength
    fun replaceItem(
        newItem: SVGLength,
        index: Number,
    ): SVGLength
}
