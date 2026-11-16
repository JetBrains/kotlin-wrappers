// Automatically generated - do not modify!

package web.svg

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
    open val transform: SVGAnimatedTransformList

    /**
     * The **`getBBox()`** method of the SVGGraphicsElement interface returns the smallest rectangle that contains the element. The rectangle is measured in the user coordinate system of the element, with the geometry attributes of the element and its descendants applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getBBox)
     */
    open fun getBBox(options: SVGBoundingBoxOptions = definedExternally): SVGRect

    /**
     * The **`getCTM()`** method of the SVGGraphicsElement interface represents the matrix that transforms the current element's coordinate system to its SVG viewport's coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getCTM)
     */
    open fun getCTM(): SVGMatrix?

    /**
     * The **`getScreenCTM()`** method of the SVGGraphicsElement interface represents the matrix that transforms the current element's coordinate system to the coordinate system of the SVG viewport for the SVG document fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getScreenCTM)
     */
    open fun getScreenCTM(): SVGMatrix?
}
