// Automatically generated - do not modify!

package dom.svg

sealed external class SVGNumberList {
    val length: Int
    val numberOfItems: Int
    fun appendItem(newItem: SVGNumber): SVGNumber
    fun clear()
    fun getItem(index: Number): SVGNumber
    fun initialize(newItem: SVGNumber): SVGNumber
    fun insertItemBefore(
        newItem: SVGNumber,
        index: Number,
    ): SVGNumber

    fun removeItem(index: Number): SVGNumber
    fun replaceItem(
        newItem: SVGNumber,
        index: Number,
    ): SVGNumber
    // [index: number]: SVGNumber
}
