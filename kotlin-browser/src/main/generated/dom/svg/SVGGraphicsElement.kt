// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMMatrix
import dom.geometry.DOMRect

sealed external class SVGGraphicsElement :
    SVGElement,
    SVGTests {
    val transform: SVGAnimatedTransformList
    fun getBBox(options: SVGBoundingBoxOptions = definedExternally): DOMRect
    fun getCTM(): DOMMatrix?
    fun getScreenCTM(): DOMMatrix?
}
