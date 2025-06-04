// Automatically generated - do not modify!

package web.svg

import web.geometry.DOMMatrix
import web.geometry.DOMRect
import kotlin.js.definedExternally

/**
 * The **`SVGGraphicsElement`** interface represents SVG elements whose primary purpose is to directly render graphics into a group.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement)
 */
open external class SVGGraphicsElement
private constructor() :
    SVGElement,
    SVGTests {
    /**
     * The **`transform`** read-only property of the SVGGraphicsElement interface reflects the computed value of the transform property and its corresponding transform attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/transform)
     */
    val transform: SVGAnimatedTransformList

    /**
     * The **`SVGGraphicsElement.getBBox()`** method allows us to determine the coordinates of the smallest rectangle in which the object fits.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getBBox)
     */
    fun getBBox(options: SVGBoundingBoxOptions = definedExternally): DOMRect

    /**
     * The `getCTM()` method of the SVGGraphicsElement interface represents the matrix that transforms the current element's coordinate system to its SVG viewport's coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getCTM)
     */
    fun getCTM(): DOMMatrix?

    /**
     * The `getScreenCTM()` method of the SVGGraphicsElement interface represents the matrix that transforms the current element's coordinate system to the coordinate system of the SVG viewport for the SVG document fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getScreenCTM)
     */
    fun getScreenCTM(): DOMMatrix?
}
