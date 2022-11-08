// Automatically generated - do not modify!

package dom.svg

import kotlinx.js.ArrayLike

sealed external class SVGStringList :
    ArrayLike<String> {
    val numberOfItems: Int
    fun appendItem(newItem: String): String
    fun clear()
    fun getItem(index: Number): String
    fun initialize(newItem: String): String
    fun insertItemBefore(
        newItem: String,
        index: Number,
    ): String

    fun removeItem(index: Number): String
    fun replaceItem(
        newItem: String,
        index: Number,
    ): String
}
