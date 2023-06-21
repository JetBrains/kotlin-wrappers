// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointInit
import web.geometry.DOMPointReadOnly

sealed external class SVGGeometryElement :
    SVGGraphicsElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/pathLength) */
    val pathLength: SVGAnimatedNumber

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getPointAtLength) */
    fun getPointAtLength(distance: Number): DOMPoint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getTotalLength) */
    fun getTotalLength(): Number

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInFill) */
    fun isPointInFill(point: DOMPointInit = definedExternally): Boolean
    fun isPointInFill(point: DOMPointReadOnly /* DOMPointInit */): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInStroke) */
    fun isPointInStroke(point: DOMPointInit = definedExternally): Boolean
    fun isPointInStroke(point: DOMPointReadOnly /* DOMPointInit */): Boolean
}
