// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The SVGStringList defines a list of DOMString objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList)
 */
external class SVGStringList
private constructor() :
    ArrayLike<String>,
    JsIterable<String> {
    val length: UInt
    val numberOfItems: UInt
    fun appendItem(newItem: String): String
    fun clear()
    fun getItem(index: UInt): String
    fun initialize(newItem: String): String
    fun insertItemBefore(
        newItem: String,
        index: UInt,
    ): String

    fun removeItem(index: UInt): String
    fun replaceItem(
        newItem: String,
        index: UInt,
    ): String
}
