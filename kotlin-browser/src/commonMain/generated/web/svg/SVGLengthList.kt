// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * The SVGLengthList defines a list of SVGLength objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList)
 */
external class SVGLengthList
private constructor() :
    ArrayLike<SVGLength>,
    JsIterable<SVGLength> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/appendItem)
     */
    fun appendItem(newItem: SVGLength): SVGLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/clear)
     */
    fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/getItem)
     */
    fun getItem(index: Int): SVGLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/initialize)
     */
    fun initialize(newItem: SVGLength): SVGLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: SVGLength,
        index: Int,
    ): SVGLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/removeItem)
     */
    fun removeItem(index: Int): SVGLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGLength,
        index: Int,
    ): SVGLength
}
