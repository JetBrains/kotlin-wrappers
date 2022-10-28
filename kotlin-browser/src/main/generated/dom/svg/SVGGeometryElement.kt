// Automatically generated - do not modify!

package dom.svg

import dom.geometry.DOMPoint
import dom.geometry.DOMPointInit

sealed external class SVGGeometryElement :
    SVGGraphicsElement {
    val pathLength: SVGAnimatedNumber
    fun getPointAtLength(distance: Number): DOMPoint
    fun getTotalLength(): Number
    fun isPointInFill(point: DOMPointInit = definedExternally): Boolean
    fun isPointInStroke(point: DOMPointInit = definedExternally): Boolean
}
