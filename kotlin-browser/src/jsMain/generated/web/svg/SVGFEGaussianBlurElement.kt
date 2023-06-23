// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feGaussianBlur> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement)
 */
sealed external class SVGFEGaussianBlurElement :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val stdDeviationX: SVGAnimatedNumber
    val stdDeviationY: SVGAnimatedNumber
    fun setStdDeviation(
        stdDeviationX: Number,
        stdDeviationY: Number,
    )
}
