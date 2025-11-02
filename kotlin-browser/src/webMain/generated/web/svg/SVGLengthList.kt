// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SVGLengthList`** interface defines a list of SVGLength objects. It is used for the baseVal and animVal properties of SVGAnimatedLengthList.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList)
 */
open external class SVGLengthList
private constructor() :
    ArrayLike<SVGLength>,
    JsIterable<SVGLength> {
    /**
     * The **`length`** property of the SVGLengthList interface returns the number of items in the list. It is an alias of numberOfItems to make SVG lists more array-like.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** property of the SVGLengthList interface returns the number of items in the list. length is an alias of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGLengthList interface inserts a new item at the end of the list. If the given item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy.
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
     * The **`getItem()`** method of the SVGLengthList interface returns the specified item from the list. The returned item is the item itself and not a copy. Any changes made to the item are immediately reflected in the list. The first item is indexed 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/getItem)
     */
    fun getItem(index: Int): SVGLength

    /**
     * The **`initialize()`** method of the SVGLengthList interface clears all existing items from the list and re-initializes the list to hold the single item specified by the parameter. If the inserted item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy. The return value is the item inserted into the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/initialize)
     */
    fun initialize(newItem: SVGLength): SVGLength

    /**
     * The **`insertItemBefore()`** method of the SVGLengthList interface inserts a new item into the list at the specified position. The first item is indexed 0. The inserted item is the item itself and not a copy.
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
     * The **`replaceItem()`** method of the SVGLengthList interface replaces an existing item in the list with a new item. If the new item is already in a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item itself and not a copy. If the item is already in this list, note that the index of the item to replace is before the removal of the item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGLength,
        index: Int,
    ): SVGLength
}
