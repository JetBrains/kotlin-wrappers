// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint

/**
 * The **`SVGPathElement`** interface corresponds to the path element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement)
 */
open external class SVGPathElement
private constructor() :
    SVGGeometryElement {
    /**
     * The **`pathLength`** read-only property of the SVGPathElement interface reflects the pathLength attribute of the given path element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/pathLength)
     */
    override val pathLength: SVGAnimatedNumber

    /**
     * The **`getPointAtLength()`** method of the SVGPathElement interface returns the point at a given distance along the path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getPointAtLength)
     */
    override fun getPointAtLength(distance: Float): DOMPoint

    /**
     * The **`getTotalLength()`** method of the SVGPathElement interface returns the user agent's computed value for the total length of the path in user units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getTotalLength)
     */
    override fun getTotalLength(): Float
}
