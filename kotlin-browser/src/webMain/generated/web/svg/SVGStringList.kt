// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable
import kotlin.js.JsString

/**
 * The **`SVGStringList`** interface defines a list of strings.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList)
 */
open external class SVGStringList
private constructor() :
    ArrayLike<JsString>,
    JsIterable<JsString> {
    /**
     * The **`length`** property of the SVGStringList interface returns the number of items in the list. It is an alias of numberOfItems to make SVG lists more array-like.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** property of the SVGStringList interface returns the number of items in the list. length is an alias of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGStringList interface inserts a new item at the end of the list. If the given item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/appendItem)
     */
    fun appendItem(newItem: String): String

    /**
     * The **`clear()`** method of the SVGStringList interface clears all existing items from the list, with the result being an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/clear)
     */
    fun clear()

    /**
     * The **`getItem()`** method of the SVGStringList interface returns the specified item from the list. The returned item is the item itself and not a copy. Any changes made to the item are immediately reflected in the list. The first item is indexed 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/getItem)
     */
    fun getItem(index: Int): String

    /**
     * The **`initialize()`** method of the SVGStringList interface clears all existing items from the list and re-initializes the list to hold the single item specified by the parameter. If the inserted item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy. The return value is the item inserted into the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/initialize)
     */
    fun initialize(newItem: String): String

    /**
     * The **`insertItemBefore()`** method of the SVGStringList interface inserts a new item into the list at the specified position. The first item is indexed 0. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: String,
        index: Int,
    ): String

    /**
     * The **`removeItem()`** method of the SVGStringList interface removes an existing item at the given index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/removeItem)
     */
    fun removeItem(index: Int): String

    /**
     * The **`replaceItem()`** method of the SVGStringList interface replaces an existing item in the list with a new item. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/replaceItem)
     */
    fun replaceItem(
        newItem: String,
        index: Int,
    ): String
}
