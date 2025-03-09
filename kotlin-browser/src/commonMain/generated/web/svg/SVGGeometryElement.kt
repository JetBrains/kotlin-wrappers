// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointReadOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement)
 */
open external class SVGGeometryElement
private constructor() :
    SVGGraphicsElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/pathLength)
     */
    val pathLength: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getPointAtLength)
     */
    fun getPointAtLength(distance: Float): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getTotalLength)
     */
    fun getTotalLength(): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInFill)
     */
    fun isPointInFill(point: DOMPointReadOnly = definedExternally): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInStroke)
     */
    fun isPointInStroke(point: DOMPointReadOnly = definedExternally): Boolean
}
