// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMMatrix2DInit

sealed external class SVGTransformList {
    val length: Int
    val numberOfItems: Int
    fun appendItem(newItem: SVGTransform): SVGTransform
    fun clear()
    fun consolidate(): SVGTransform?
    fun createSVGTransformFromMatrix(matrix: DOMMatrix2DInit = definedExternally): SVGTransform
    fun getItem(index: Number): SVGTransform
    fun initialize(newItem: SVGTransform): SVGTransform
    fun insertItemBefore(
        newItem: SVGTransform,
        index: Number,
    ): SVGTransform

    fun removeItem(index: Number): SVGTransform
    fun replaceItem(
        newItem: SVGTransform,
        index: Number,
    ): SVGTransform
    // [index: number]: SVGTransform
}
