// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SVGLengthList`** interface defines a list of SVGLength objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList)
 */
external class SVGLengthList
private constructor() :
    ArrayLike<SVGLength>,
    JsIterable<SVGLength> {
    /**
     * The **`length`** property of the SVGLengthList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** property of the SVGLengthList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGLengthList interface inserts a new item at the end of the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/appendItem)
     */
    fun appendItem(newItem: SVGLength): SVGLength

    /**
     * The **`clear()`** method of the SVGLengthList interface clears all existing items from the list, with the result being an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/clear)
     */
    fun clear()

    /**
     * The **`getItem()`** method of the SVGLengthList interface returns the specified item from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/getItem)
     */
    fun getItem(index: Int): SVGLength

    /**
     * The **`initialize()`** method of the SVGLengthList interface clears all existing items from the list and re-initializes the list to hold the single item specified by the parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/initialize)
     */
    fun initialize(newItem: SVGLength): SVGLength

    /**
     * The **`insertItemBefore()`** method of the SVGLengthList interface inserts a new item into the list at the specified position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: SVGLength,
        index: Int,
    ): SVGLength

    /**
     * The **`removeItem()`** method of the SVGLengthList interface removes an existing item at the given index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/removeItem)
     */
    fun removeItem(index: Int): SVGLength

    /**
     * The **`replaceItem()`** method of the SVGLengthList interface replaces an existing item in the list with a new item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGLength,
        index: Int,
    ): SVGLength
}
