// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGPatternElement`** interface corresponds to the <pattern> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement)
 */
open external class SVGPatternElement
private constructor() :
    SVGElement,
    SVGFitToViewBox,
    SVGURIReference {
    /**
     * The **`height`** read-only property of the SVGPatternElement interface describes the height of the pattern as an SVGAnimatedLength. It reflects the computed value of the height attribute on the <pattern> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/height)
     */
    val height: SVGAnimatedLength

    /**
     * The **`patternContentUnits`** read-only property of the SVGPatternElement interface reflects the patternContentUnits attribute of the given <pattern> element. It specifies the coordinate system for the pattern content and takes one of the constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/patternContentUnits)
     */
    val patternContentUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>

    /**
     * The **`patternTransform`** read-only property of the SVGPatternElement interface reflects the patternTransform attribute of the given <pattern> element. This property holds the transformation applied to the pattern itself, allowing for operations like translate, rotate, scale, and skew.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/patternTransform)
     */
    val patternTransform: SVGAnimatedTransformList

    /**
     * The **`patternUnits`** read-only property of the SVGPatternElement interface reflects the patternUnits attribute of the given <pattern> element. It specifies the coordinate system for the pattern content and takes one of the constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/patternUnits)
     */
    val patternUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>

    /**
     * The **`width`** read-only property of the SVGPatternElement interface describes the width of the pattern as an SVGAnimatedLength. It reflects the computed value of the width attribute on the <pattern> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/width)
     */
    val width: SVGAnimatedLength

    /**
     * The **`x`** read-only property of the SVGPatternElement interface describes the x-axis coordinate of the start point of the pattern as an SVGAnimatedLength. It reflects the computed value of the x attribute on the <pattern> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/x)
     */
    val x: SVGAnimatedLength

    /**
     * The **`y`** read-only property of the SVGPatternElement interface describes the y-axis coordinate of the start point of the pattern as an SVGAnimatedLength. It reflects the computed value of the y attribute on the <pattern> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/y)
     */
    val y: SVGAnimatedLength
}
