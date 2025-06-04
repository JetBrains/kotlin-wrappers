// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGGradient`** interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement)
 */
open external class SVGGradientElement
private constructor() :
    SVGElement,
    SVGURIReference {
    /**
     * The **`gradientTransform`** read-only property of the SVGGradientElement interface reflects the gradientTransform attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement/gradientTransform)
     */
    val gradientTransform: SVGAnimatedTransformList

    /**
     * The **`gradientUnits`** read-only property of the SVGGradientElement interface reflects the gradientUnits attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement/gradientUnits)
     */
    val gradientUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>

    /**
     * The **`spreadMethod`** read-only property of the SVGGradientElement interface reflects the spreadMethod attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement/spreadMethod)
     */
    val spreadMethod: SVGAnimatedEnumeration<SpreadMethod>
    val SVG_SPREADMETHOD_UNKNOWN: SpreadMethod
    val SVG_SPREADMETHOD_PAD: SpreadMethod
    val SVG_SPREADMETHOD_REFLECT: SpreadMethod
    val SVG_SPREADMETHOD_REPEAT: SpreadMethod

    companion object {
        val SVG_SPREADMETHOD_UNKNOWN: SpreadMethod
        val SVG_SPREADMETHOD_PAD: SpreadMethod
        val SVG_SPREADMETHOD_REFLECT: SpreadMethod
        val SVG_SPREADMETHOD_REPEAT: SpreadMethod
    }

    sealed interface SpreadMethod
}
