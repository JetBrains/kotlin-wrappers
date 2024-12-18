// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The SVGNumberList defines a list of SVGNumber objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList)
 */
external class SVGNumberList
private constructor() :
    ArrayLike<SVGNumber>,
    JsIterable<SVGNumber> {
    val length: UInt
    val numberOfItems: UInt
    fun appendItem(newItem: SVGNumber): SVGNumber
    fun clear()
    fun getItem(index: UInt): SVGNumber
    fun initialize(newItem: SVGNumber): SVGNumber
    fun insertItemBefore(
        newItem: SVGNumber,
        index: UInt,
    ): SVGNumber

    fun removeItem(index: UInt): SVGNumber
    fun replaceItem(
        newItem: SVGNumber,
        index: UInt,
    ): SVGNumber
}
