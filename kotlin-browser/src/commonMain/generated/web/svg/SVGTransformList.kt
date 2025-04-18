// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable
import web.geometry.DOMMatrixReadOnly
import kotlin.js.definedExternally

/**
 * The **`SVGTransformList`** interface defines a list of SVGTransform objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList)
 */
external class SVGTransformList
private constructor() :
    ArrayLike<SVGTransform>,
    JsIterable<SVGTransform> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/length)
     */
    override val length: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/appendItem)
     */
    fun appendItem(newItem: SVGTransform): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/clear)
     */
    fun clear()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/consolidate)
     */
    fun consolidate(): SVGTransform?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/createSVGTransformFromMatrix)
     */
    fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/getItem)
     */
    fun getItem(index: Int): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/initialize)
     */
    fun initialize(newItem: SVGTransform): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/insertItemBefore)
     */
    fun insertItemBefore(
        newItem: SVGTransform,
        index: Int,
    ): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/removeItem)
     */
    fun removeItem(index: Int): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/replaceItem)
     */
    fun replaceItem(
        newItem: SVGTransform,
        index: Int,
    ): SVGTransform
}
