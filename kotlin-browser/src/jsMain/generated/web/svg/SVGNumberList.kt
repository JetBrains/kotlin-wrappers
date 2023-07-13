// Automatically generated - do not modify!

package web.svg

import js.core.ArrayLike
import js.iterable.JsIterable

/**
 * The SVGNumberList defines a list of SVGNumber objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList)
 */
sealed external class SVGNumberList :
    ArrayLike<SVGNumber>,
    JsIterable<SVGNumber> {
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
