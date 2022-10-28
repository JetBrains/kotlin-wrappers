// Automatically generated - do not modify!

package dom.svg

sealed external class SVGStringList {
    val length: Int
    val numberOfItems: Number
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
    // [index: number]: string
}
