// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feGaussianBlur> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement)
 */
open external class SVGFEGaussianBlurElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/stdDeviationX)
     */
    val stdDeviationX: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/stdDeviationY)
     */
    val stdDeviationY: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/setStdDeviation)
     */
    fun setStdDeviation(
        stdDeviationX: Float,
        stdDeviationY: Float,
    )
}
