// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointReadOnly
import kotlin.js.definedExternally

/**
 * The `SVGGeometryElement` interface represents SVG elements whose rendering is defined by geometry with an equivalent path, and which can be filled and stroked.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement)
 */
open external class SVGGeometryElement
private constructor() :
    SVGGraphicsElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/pathLength)
     */
    open val pathLength: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getPointAtLength)
     */
    open fun getPointAtLength(distance: Float): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getTotalLength)
     */
    open fun getTotalLength(): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInFill)
     */
    fun isPointInFill(point: DOMPointReadOnly = definedExternally): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInStroke)
     */
    fun isPointInStroke(point: DOMPointReadOnly = definedExternally): Boolean
}
