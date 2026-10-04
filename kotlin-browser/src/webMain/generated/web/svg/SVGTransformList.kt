// Automatically generated - do not modify!

package web.svg

import js.array.ArrayLike
import js.iterable.JsIterable
import web.errors.DOMExceptionType.IndexSizeError
import web.errors.DOMExceptionType.NoModificationAllowedError
import web.errors.JsThrows
import web.geometry.DOMMatrixReadOnly

/**
 * The **`SVGTransformList`** interface defines a list of SVGTransform objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList)
 */
open external class SVGTransformList
private constructor() :
    ArrayLike<SVGTransform>,
    JsIterable.Mixin<SVGTransform> {
    /**
     * The **`length`** read-only property of the SVGTransformList interface represents the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/length)
     */
    override val length: Int

    /**
     * The **`numberOfItems`** read-only property of the SVGTransformList interface represents the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/numberOfItems)
     */
    val numberOfItems: Int

    /**
     * The **`appendItem()`** method of the SVGTransformList interface inserts a new item at the end of the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/appendItem)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun appendItem(newItem: SVGTransform): SVGTransform

    /**
     * The **`clear()`** method of the SVGTransformList interface clears all existing current items from the list, with the result being an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/clear)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun clear()

    /**
     * The **`consolidate()`** method of the SVGTransformList interface consolidates the list of separate SVGTransform objects by multiplying the equivalent transformation matrices together to result in a list consisting of a single SVGTransform object of type SVG_TRANSFORM_MATRIX.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/consolidate)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun consolidate(): SVGTransform?

    /**
     * The **`createSVGTransformFromMatrix()`** method of the SVGTransformList interface creates an SVGTransform object which is initialized to a transform of type SVG_TRANSFORM_MATRIX and whose values are the given matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/createSVGTransformFromMatrix)
     */
    fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally): SVGTransform

    /**
     * The **`getItem()`** method of the SVGTransformList interface returns the specified item from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/getItem)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun getItem(index: Int): SVGTransform

    /**
     * The **`initialize()`** method of the SVGTransformList interface clears all existing current items from the list and re-initializes the list to hold the single item specified by the parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/initialize)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun initialize(newItem: SVGTransform): SVGTransform

    /**
     * The **`insertItemBefore()`** method of the SVGTransformList interface inserts a new item into the list at the specified position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/insertItemBefore)
     */
    @JsThrows(NoModificationAllowedError::class)
    fun insertItemBefore(
        newItem: SVGTransform,
        index: Int,
    ): SVGTransform

    /**
     * The **`removeItem()`** method of the SVGTransformList interface removes an existing item from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/removeItem)
     */
    @JsThrows(IndexSizeError::class)
    @JsThrows(NoModificationAllowedError::class)
    fun removeItem(index: Int): SVGTransform

    /**
     * The **`replaceItem()`** method of the SVGTransformList interface replaces an existing item in the list with a new item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/replaceItem)
     */
    @JsThrows(IndexSizeError::class)
    @JsThrows(NoModificationAllowedError::class)
    fun replaceItem(
        newItem: SVGTransform,
        index: Int,
    ): SVGTransform
}
