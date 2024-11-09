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
    override val length: Int
    val numberOfItems: Int
    fun appendItem(newItem: String): String
    fun clear()
    fun getItem(index: Int): String
    fun initialize(newItem: String): String
    fun insertItemBefore(
        newItem: String,
        index: Int,
    ): String

    fun removeItem(index: Int): String
    fun replaceItem(
        newItem: String,
        index: Int,
    ): String
}
