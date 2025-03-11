// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMMatrix
import web.geometry.DOMRect
import kotlin.js.definedExternally

/**
 * SVG elements whose primary purpose is to directly render graphics into a group.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement)
 */
open external class SVGGraphicsElement
private constructor() :
    SVGElement,
    SVGTests {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/transform)
     */
    val transform: SVGAnimatedTransformList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getBBox)
     */
    fun getBBox(options: SVGBoundingBoxOptions = definedExternally): DOMRect

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getCTM)
     */
    fun getCTM(): DOMMatrix?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getScreenCTM)
     */
    fun getScreenCTM(): DOMMatrix?
}
