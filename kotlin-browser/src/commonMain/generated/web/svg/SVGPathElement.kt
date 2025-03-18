// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint

/**
 * Corresponds to the <path> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement)
 */
open external class SVGPathElement
private constructor() :
    SVGGeometryElement {
    override val pathLength: SVGAnimatedNumber
    override fun getPointAtLength(distance: Float): DOMPoint
    override fun getTotalLength(): Float
}
