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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/pathLength)
     */
    override val pathLength: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getPointAtLength)
     */
    override fun getPointAtLength(distance: Float): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getTotalLength)
     */
    override fun getTotalLength(): Float
}
