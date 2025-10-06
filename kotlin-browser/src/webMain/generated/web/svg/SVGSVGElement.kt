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
     * The **`currentScale`** property of the SVGSVGElement interface reflects the current scale factor relative to the initial view to take into account user magnification and panning operations on the outermost svg element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/currentScale)
     */
    var currentScale: Float

    /**
     * The **`currentTranslate`** read-only property of the SVGSVGElement interface reflects the translation factor that takes into account user 'magnification' corresponding to an outermost svg element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/currentTranslate)
     */
    val currentTranslate: DOMPointReadOnly

    /**
     * The **`height`** read-only property of the SVGSVGElement interface describes the vertical size of element as an SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/height)
     */
    val height: SVGAnimatedLength

    /**
     * The **`width`** read-only property of the SVGSVGElement interface describes the horizontal size of element as an SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/width)
     */
    val width: SVGAnimatedLength

    /**
     * The **`x`** read-only property of the SVGSVGElement interface describes the horizontal coordinate of the position of that SVG as an SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/x)
     */
    val x: SVGAnimatedLength

    /**
     * The **`y`** read-only property of the SVGSVGElement interface describes the vertical coordinate of the position of that SVG as an SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/y)
     */
    val y: SVGAnimatedLength

    /**
     * The `animationsPaused()` method of the SVGSVGElement interface checks whether the animations in the SVG document fragment are currently paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/animationsPaused)
     */
    fun animationsPaused(): Boolean

    /**
     * The `checkEnclosure()` method of the SVGSVGElement interface checks if the rendered content of the given element is entirely contained within the supplied rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/checkEnclosure)
     */
    fun checkEnclosure(
        element: SVGElement,
        rect: DOMRectReadOnly,
    ): Boolean

    /**
     * The `checkIntersection()` method of the SVGSVGElement interface checks if the rendered content of the given element intersects the supplied rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/checkIntersection)
     */
    fun checkIntersection(
        element: SVGElement,
        rect: DOMRectReadOnly,
    ): Boolean

    /**
     * The `createSVGAngle()` method of the SVGSVGElement interface creates an SVGAngle object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGAngle)
     */
    fun createSVGAngle(): SVGAngle

    /**
     * The `createSVGLength()` method of the SVGSVGElement interface creates an SVGLength object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGLength)
     */
    fun createSVGLength(): SVGLength

    /**
     * The `createSVGMatrix()` method of the SVGSVGElement interface creates a DOMMatrix object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGMatrix)
     */
    fun createSVGMatrix(): DOMMatrix

    /**
     * The `createSVGNumber()` method of the SVGSVGElement interface creates an SVGNumber object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGNumber)
     */
    fun createSVGNumber(): SVGNumber

    /**
     * The `createSVGPoint()` method of the SVGSVGElement interface creates a DOMPoint object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGPoint)
     */
    fun createSVGPoint(): DOMPoint

    /**
     * The `createSVGRect()` method of the SVGSVGElement interface creates an DOMRect object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGRect)
     */
    fun createSVGRect(): DOMRect

    /**
     * The `createSVGTransform()` method of the SVGSVGElement interface creates an SVGTransform object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGTransform)
     */
    fun createSVGTransform(): SVGTransform

    /**
     * The `createSVGTransformFromMatrix()` method of the SVGSVGElement interface creates an SVGTransform object outside of any document trees, based on the given DOMMatrix object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGTransformFromMatrix)
     */
    fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */ = definedExternally): SVGTransform

    /**
     * The `deselectAll()` method of the SVGSVGElement interface unselects any selected objects, including any selections of text strings and type-in bars.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/deselectAll)
     */
    fun deselectAll()

    /**
     * The `getCurrentTime()` method of the SVGSVGElement interface returns the current time in seconds relative to the start time for the current SVG document fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/getCurrentTime)
     */
    fun getCurrentTime(): Float

    /**
     * The `getElementById()` method of the SVGSVGElement interface searches the SVG document fragment (i.e., the search is restricted to a subset of the document tree) for an Element whose `id` property matches the specified string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/getElementById)
     */
    fun getElementById(elementId: ElementId): Element?
    fun getEnclosureList(
        rect: DOMRectReadOnly,
        referenceElement: SVGElement?,
    ): NodeList<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>

    fun getIntersectionList(
        rect: DOMRectReadOnly,
        referenceElement: SVGElement?,
    ): NodeList<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>

    /**
     * The `pauseAnimations()` method of the SVGSVGElement interface suspends (i.e., pauses) all currently running animations that are defined within the SVG document fragment corresponding to this svg element, causing the animation clock corresponding to this document fragment to stand still until it is unpaused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/pauseAnimations)
     */
    fun pauseAnimations()

    /**
     * The `setCurrentTime()` method of the SVGSVGElement interface adjusts the clock for this SVG document fragment, establishing a new current time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/setCurrentTime)
     */
    fun setCurrentTime(seconds: Float)

    /**
     * The `unpauseAnimations()` method of the SVGSVGElement interface resumes (i.e., unpauses) currently running animations that are defined within the SVG document fragment, causing the animation clock to continue from the time at which it was suspended.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/unpauseAnimations)
     */
    fun unpauseAnimations()
}
