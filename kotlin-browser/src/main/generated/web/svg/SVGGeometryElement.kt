// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMPoint
import web.geometry.DOMPointInit
import web.geometry.DOMPointReadOnly

sealed external class SVGGeometryElement :
    SVGGraphicsElement {
    val pathLength: SVGAnimatedNumber
    fun getPointAtLength(distance: Number): DOMPoint
    fun getTotalLength(): Number
    fun isPointInFill(point: DOMPointInit = definedExternally): Boolean
    fun isPointInFill(point: DOMPointReadOnly /* DOMPointInit */): Boolean
    fun isPointInStroke(point: DOMPointInit = definedExternally): Boolean
    fun isPointInStroke(point: DOMPointReadOnly /* DOMPointInit */): Boolean
}
