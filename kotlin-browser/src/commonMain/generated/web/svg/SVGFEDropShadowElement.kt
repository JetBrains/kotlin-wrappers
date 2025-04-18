// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEDropShadowElement`** interface corresponds to the feDropShadow element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement)
 */
open external class SVGFEDropShadowElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/dx)
     */
    val dx: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/dy)
     */
    val dy: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/stdDeviationX)
     */
    val stdDeviationX: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/stdDeviationY)
     */
    val stdDeviationY: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/setStdDeviation)
     */
    fun setStdDeviation(
        stdDeviationX: Float,
        stdDeviationY: Float,
    )
}
