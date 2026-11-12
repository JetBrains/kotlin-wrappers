// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEDropShadowElement`** interface corresponds to the <feDropShadow> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement)
 */
open external class SVGFEDropShadowElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`dx`** read-only property of the SVGFEDropShadowElement interface reflects the dx attribute of the given <feDropShadow> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/dx)
     */
    open val dx: SVGAnimatedNumber

    /**
     * The **`dy`** read-only property of the SVGFEDropShadowElement interface reflects the dy attribute of the given <feDropShadow> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/dy)
     */
    open val dy: SVGAnimatedNumber

    /**
     * The **`in1`** read-only property of the SVGFEDropShadowElement interface reflects the in attribute of the given <feDropShadow> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/in1)
     */
    open val in1: SVGAnimatedString

    /**
     * The **`stdDeviationX`** read-only property of the SVGFEDropShadowElement interface reflects the (possibly automatically computed) X component of the stdDeviation attribute of the given <feDropShadow> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/stdDeviationX)
     */
    open val stdDeviationX: SVGAnimatedNumber

    /**
     * The **`stdDeviationY`** read-only property of the SVGFEDropShadowElement interface reflects the (possibly automatically computed) Y component of the stdDeviation attribute of the given <feDropShadow> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/stdDeviationY)
     */
    open val stdDeviationY: SVGAnimatedNumber

    /**
     * The **`setStdDeviation()`** method of the SVGFEDropShadowElement interface sets the values for the stdDeviation attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDropShadowElement/setStdDeviation)
     */
    open fun setStdDeviation(
        stdDeviationX: Float,
        stdDeviationY: Float,
    )
}
