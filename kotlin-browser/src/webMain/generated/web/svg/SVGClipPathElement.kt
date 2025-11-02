// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGClipPathElement`** interface provides access to the properties of <clipPath> elements, as well as methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGClipPathElement)
 */
open external class SVGClipPathElement
private constructor() :
    SVGElement {
    /**
     * The read-only **`clipPathUnits`** property of the SVGClipPathElement interface reflects the clipPathUnits attribute of a <clipPath> element which defines the coordinate system to use for the content of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGClipPathElement/clipPathUnits)
     */
    val clipPathUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>

    /**
     * The read-only **`transform`** property of the SVGClipPathElement interface reflects the transform attribute of a <clipPath> element, that is a list of transformations applied to the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGClipPathElement/transform)
     */
    val transform: SVGAnimatedTransformList
}
