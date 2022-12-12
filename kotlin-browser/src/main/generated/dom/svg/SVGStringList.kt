// Automatically generated - do not modify!

package dom.svg

import js.core.ArrayLike
import js.core.JsIterable

sealed external class SVGStringList :
    ArrayLike<String>,
    JsIterable<String> {
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
