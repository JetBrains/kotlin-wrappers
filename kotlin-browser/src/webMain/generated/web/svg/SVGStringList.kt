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
     * The **`length`** property of the SVGStringList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** property of the SVGStringList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGStringList interface inserts a new item at the end of the list.
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
     * The **`getItem()`** method of the SVGStringList interface returns the specified item from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/getItem)
     */
    fun getItem(index: Int): String

    /**
     * The **`initialize()`** method of the SVGStringList interface clears all existing items from the list and re-initializes the list to hold the single item specified by the parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/initialize)
     */
    fun initialize(newItem: String): String

    /**
     * The **`insertItemBefore()`** method of the SVGStringList interface inserts a new item into the list at the specified position.
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
     * The **`replaceItem()`** method of the SVGStringList interface replaces an existing item in the list with a new item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/replaceItem)
     */
    fun replaceItem(
        newItem: String,
        index: Int,
    ): String
}
