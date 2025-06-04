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
     * The **`SVGGeometryElement.pathLength`** property reflects the A number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/pathLength)
     */
    open val pathLength: SVGAnimatedNumber

    /**
     * The **`SVGGeometryElement.getPointAtLength()`** method returns the point at a given distance along the path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getPointAtLength)
     */
    open fun getPointAtLength(distance: Float): DOMPoint

    /**
     * The **`SVGGeometryElement.getTotalLength()`** method returns the user agent's computed value for the total length of the path in user units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getTotalLength)
     */
    open fun getTotalLength(): Float

    /**
     * The **`isPointInFill()`** method of the SVGGeometryElement interface determines whether a given point is within the fill shape of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInFill)
     */
    fun isPointInFill(point: DOMPointReadOnly = definedExternally): Boolean

    /**
     * The **`isPointInStroke()`** method of the SVGGeometryElement interface determines whether a given point is within the stroke shape of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInStroke)
     */
    fun isPointInStroke(point: DOMPointReadOnly = definedExternally): Boolean
}
