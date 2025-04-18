// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The **`SVGNumberList`** interface defines a list of numbers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList)
 */
external class SVGNumberList
private constructor() :
    ArrayLike<SVGNumber>,
    JsIterable<SVGNumber> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/appendItem)
     */
    fun appendItem(newItem: SVGNumber): SVGNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/clear)
     */
    fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/getItem)
     */
    fun getItem(index: Int): SVGNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/initialize)
     */
    fun initialize(newItem: SVGNumber): SVGNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: SVGNumber,
        index: Int,
    ): SVGNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/removeItem)
     */
    fun removeItem(index: Int): SVGNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGNumber,
        index: Int,
    ): SVGNumber
}
