// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.core.JsString
import js.iterable.JsIterable

/**
 * The **`SVGStringList`** interface defines a list of strings.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList)
 */
external class SVGStringList
private constructor() :
    ArrayLike<JsString>,
    JsIterable<JsString> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/appendItem)
     */
    fun appendItem(newItem: String): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/clear)
     */
    fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/getItem)
     */
    fun getItem(index: Int): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/initialize)
     */
    fun initialize(newItem: String): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: String,
        index: Int,
    ): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/removeItem)
     */
    fun removeItem(index: Int): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/replaceItem)
     */
    fun replaceItem(
        newItem: String,
        index: Int,
    ): String
}
