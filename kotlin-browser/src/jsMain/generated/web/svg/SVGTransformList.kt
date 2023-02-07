// Automatically generated - do not modify!

package web.svg

import js.core.ArrayLike
import js.core.JsIterable
import web.geometry.DOMMatrix2DInit
import web.geometry.DOMMatrixReadOnly

sealed external class SVGTransformList :
    ArrayLike<SVGTransform>,
    JsIterable<SVGTransform> {
    val numberOfItems: Int
    fun appendItem(newItem: SVGTransform): SVGTransform
    fun clear()
    fun consolidate(): SVGTransform?
    fun createSVGTransformFromMatrix(matrix: DOMMatrix2DInit = definedExternally): SVGTransform
    fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */): SVGTransform
    fun getItem(index: Int): SVGTransform
    fun initialize(newItem: SVGTransform): SVGTransform
    fun insertItemBefore(
        newItem: SVGTransform,
        index: Int,
    ): SVGTransform

    fun removeItem(index: Int): SVGTransform
    fun replaceItem(
        newItem: SVGTransform,
        index: Int,
    ): SVGTransform
}
