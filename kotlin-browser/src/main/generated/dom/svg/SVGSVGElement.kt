// Automatically generated - do not modify!

package dom.svg

import dom.Element
import dom.NodeListOf
import dom.geometry.*
import dom.html.WindowEventHandlers

sealed external class SVGSVGElement :
    SVGGraphicsElement,
    SVGFitToViewBox,
    WindowEventHandlers {
    var currentScale: Double
    val currentTranslate: DOMPointReadOnly
    val height: SVGAnimatedLength
    val width: SVGAnimatedLength
    val x: SVGAnimatedLength
    val y: SVGAnimatedLength
    fun animationsPaused(): Boolean
    fun checkEnclosure(
        element: SVGElement,
        rect: DOMRectReadOnly,
    ): Boolean

    fun checkIntersection(
        element: SVGElement,
        rect: DOMRectReadOnly,
    ): Boolean

    fun createSVGAngle(): SVGAngle
    fun createSVGLength(): SVGLength
    fun createSVGMatrix(): DOMMatrix
    fun createSVGNumber(): SVGNumber
    fun createSVGPoint(): DOMPoint
    fun createSVGRect(): DOMRect
    fun createSVGTransform(): SVGTransform
    fun createSVGTransformFromMatrix(matrix: DOMMatrix2DInit = definedExternally): SVGTransform
    fun deselectAll()
    fun getCurrentTime(): Number
    fun getElementById(elementId: String): Element
    fun getEnclosureList(
        rect: DOMRectReadOnly,
        referenceElement: SVGElement?,
    ): NodeListOf<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>

    fun getIntersectionList(
        rect: DOMRectReadOnly,
        referenceElement: SVGElement?,
    ): NodeListOf<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>

    fun pauseAnimations()
    fun setCurrentTime(seconds: Number)
    fun unpauseAnimations()
}
