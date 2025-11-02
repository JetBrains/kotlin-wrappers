// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SVGNumberList`** interface defines a list of numbers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList)
 */
open external class SVGNumberList
private constructor() :
    ArrayLike<SVGNumber>,
    JsIterable<SVGNumber> {
    /**
     * The **`length`** property of the SVGNumberList interface returns the number of items in the list. It is an alias of numberOfItems to make SVG lists more array-like.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** property of the SVGNumberList interface returns the number of items in the list. length is an alias of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGNumberList interface inserts a new item at the end of the list. If the given item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/appendItem)
     */
    fun appendItem(newItem: SVGNumber): SVGNumber

    /**
     * The **`clear()`** method of the SVGNumberList interface clears all existing items from the list, with the result being an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/clear)
     */
    fun clear()

    /**
     * The **`getItem()`** method of the SVGNumberList interface returns the specified item from the list. The returned item is the item itself and not a copy. Any changes made to the item are immediately reflected in the list. The first item is indexed 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/getItem)
     */
    fun getItem(index: Int): SVGNumber

    /**
     * The **`initialize()`** method of the SVGNumberList interface clears all existing items from the list and re-initializes the list to hold the single item specified by the parameter. If the inserted item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy. The return value is the item inserted into the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/initialize)
     */
    fun initialize(newItem: SVGNumber): SVGNumber

    /**
     * The **`insertItemBefore()`** method of the SVGNumberList interface inserts a new item into the list at the specified position. The first item is indexed 0. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: SVGNumber,
        index: Int,
    ): SVGNumber

    /**
     * The **`removeItem()`** method of the SVGNumberList interface removes an existing item at the given index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/removeItem)
     */
    fun removeItem(index: Int): SVGNumber

    /**
     * The **`replaceItem()`** method of the SVGNumberList interface replaces an existing item in the list with a new item. If the new item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy. If the item is already in this list, note that the index of the item to replace is before the removal of the item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGNumber,
        index: Int,
    ): SVGNumber
}
