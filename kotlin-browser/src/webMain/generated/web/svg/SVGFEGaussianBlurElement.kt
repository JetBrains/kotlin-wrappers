// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEGaussianBlurElement`** interface corresponds to the <feGaussianBlur> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement)
 */
open external class SVGFEGaussianBlurElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFEGaussianBlurElement interface reflects the in attribute of the given <feGaussianBlur> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`stdDeviationX`** read-only property of the SVGFEGaussianBlurElement interface reflects the (possibly automatically computed) X component of the stdDeviation attribute of the given <feGaussianBlur> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/stdDeviationX)
     */
    val stdDeviationX: SVGAnimatedNumber

    /**
     * The **`stdDeviationY`** read-only property of the SVGFEGaussianBlurElement interface reflects the (possibly automatically computed) Y component of the stdDeviation attribute of the given <feGaussianBlur> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/stdDeviationY)
     */
    val stdDeviationY: SVGAnimatedNumber

    /**
     * The **`setStdDeviation()`** method of the SVGFEGaussianBlurElement interface sets the values for the stdDeviation attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEGaussianBlurElement/setStdDeviation)
     */
    fun setStdDeviation(
        stdDeviationX: Float,
        stdDeviationY: Float,
    )
}
