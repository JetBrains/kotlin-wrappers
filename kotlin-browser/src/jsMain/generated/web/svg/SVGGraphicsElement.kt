// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMMatrix
import web.geometry.DOMRect

/**
 * SVG elements whose primary purpose is to directly render graphics into a group.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement)
 */
sealed external class SVGGraphicsElement :
    SVGElement,
    SVGTests {
    val transform: SVGAnimatedTransformList

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getBBox) */
    fun getBBox(options: SVGBoundingBoxOptions = definedExternally): DOMRect
    fun getCTM(): DOMMatrix?
    fun getScreenCTM(): DOMMatrix?
}
