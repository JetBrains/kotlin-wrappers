// Automatically generated - do not modify!

package web.svg

import web.dom.Element
import web.dom.ElementId
import web.dom.NodeList
import web.geometry.*
import web.window.WindowEventHandlers
import kotlin.js.definedExternally

/**
 * The **`SVGSVGElement`** interface provides access to the properties of svg elements, as well as methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement)
 */
open external class SVGSVGElement
private constructor() :
    SVGGraphicsElement,
    SVGFitToViewBox,
    WindowEventHandlers {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/currentScale)
     */
    var currentScale: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/currentTranslate)
     */
    val currentTranslate: DOMPointReadOnly

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/height)
     */
    val height: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/width)
     */
    val width: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/x)
     */
    val x: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/y)
     */
    val y: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/animationsPaused)
     */
    fun animationsPaused(): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/checkEnclosure)
     */
    fun checkEnclosure(
        element: SVGElement,
        rect: DOMRectReadOnly,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/checkIntersection)
     */
    fun checkIntersection(
        element: SVGElement,
        rect: DOMRectReadOnly,
    ): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGAngle)
     */
    fun createSVGAngle(): SVGAngle

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGLength)
     */
    fun createSVGLength(): SVGLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGMatrix)
     */
    fun createSVGMatrix(): DOMMatrix

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGNumber)
     */
    fun createSVGNumber(): SVGNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGPoint)
     */
    fun createSVGPoint(): DOMPoint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGRect)
     */
    fun createSVGRect(): DOMRect

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGTransform)
     */
    fun createSVGTransform(): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGTransformFromMatrix)
     */
    fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally): SVGTransform

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/deselectAll)
     */
    fun deselectAll()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/getCurrentTime)
     */
    fun getCurrentTime(): Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/getElementById)
     */
    fun getElementById(elementId: ElementId): Element
    fun getEnclosureList(
        rect: DOMRectReadOnly,
        referenceElement: SVGElement?,
    ): NodeList<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>

    fun getIntersectionList(
        rect: DOMRectReadOnly,
        referenceElement: SVGElement?,
    ): NodeList<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/pauseAnimations)
     */
    fun pauseAnimations()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/setCurrentTime)
     */
    fun setCurrentTime(seconds: Float)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/unpauseAnimations)
     */
    fun unpauseAnimations()
}
