// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFilterElement`** interface provides access to the properties of <filter> elements, as well as methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement)
 */
open external class SVGFilterElement
private constructor() :
    SVGElement,
    SVGURIReference {
    /**
     * The **`filterUnits`** read-only property of the SVGFilterElement interface reflects the filterUnits attribute of the given <filter> element. It takes one of the SVG_UNIT_TYPE_* constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement/filterUnits)
     */
    val filterUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>

    /**
     * The **`height`** read-only property of the SVGFilterElement interface describes the vertical size of an SVG filter primitive as a SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement/height)
     */
    val height: SVGAnimatedLength

    /**
     * The **`primitiveUnits`** read-only property of the SVGFilterElement interface reflects the primitiveUnits attribute of the given <filter> element. It takes one of the SVG_UNIT_TYPE_* constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement/primitiveUnits)
     */
    val primitiveUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>

    /**
     * The **`width`** read-only property of the SVGFilterElement interface describes the horizontal size of an SVG filter primitive as a SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement/width)
     */
    val width: SVGAnimatedLength

    /**
     * The **`x`** read-only property of the SVGFilterElement interface describes the horizontal coordinate of the position of an SVG filter primitive as a SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement/x)
     */
    val x: SVGAnimatedLength

    /**
     * The **`y`** read-only property of the SVGFilterElement interface describes the vertical coordinate of the position of an SVG filter primitive as a SVGAnimatedLength.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFilterElement/y)
     */
    val y: SVGAnimatedLength
}
