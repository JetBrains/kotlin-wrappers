// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEConvolveMatrixElement`** interface corresponds to the <feConvolveMatrix> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement)
 */
open external class SVGFEConvolveMatrixElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`bias`** read-only property of the SVGFEConvolveMatrixElement interface reflects the bias attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/bias)
     */
    val bias: SVGAnimatedNumber

    /**
     * The **`divisor`** read-only property of the SVGFEConvolveMatrixElement interface reflects the divisor attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/divisor)
     */
    val divisor: SVGAnimatedNumber

    /**
     * The **`edgeMode`** read-only property of the SVGFEConvolveMatrixElement interface reflects the edgeMode attribute of the given <feConvolveMatrix> element. The SVG_EDGEMODE_* constants defined on this interface are represented by the numbers 1 through 3, where the default duplicate is 1, wrap is 2, and none is 3.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/edgeMode)
     */
    val edgeMode: SVGAnimatedEnumeration<EdgeMode>

    /**
     * The **`in1`** read-only property of the SVGFEConvolveMatrixElement interface reflects the in attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`kernelMatrix`** read-only property of the SVGFEConvolveMatrixElement interface reflects the kernelMatrix attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/kernelMatrix)
     */
    val kernelMatrix: SVGAnimatedNumberList

    /**
     * The **`kernelUnitLengthX`** read-only property of the SVGFEConvolveMatrixElement interface reflects the kernelUnitLength attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/kernelUnitLengthX)
     */
    val kernelUnitLengthX: SVGAnimatedNumber

    /**
     * The **`kernelUnitLengthY`** read-only property of the SVGFEConvolveMatrixElement interface reflects the kernelUnitLength attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/kernelUnitLengthY)
     */
    val kernelUnitLengthY: SVGAnimatedNumber

    /**
     * The **`orderX`** read-only property of the SVGFEConvolveMatrixElement interface reflects the order attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/orderX)
     */
    val orderX: SVGAnimatedInteger

    /**
     * The **`orderY`** read-only property of the SVGFEConvolveMatrixElement interface reflects the order attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/orderY)
     */
    val orderY: SVGAnimatedInteger

    /**
     * The **`preserveAlpha`** read-only property of the SVGFEConvolveMatrixElement interface reflects the preserveAlpha attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/preserveAlpha)
     */
    val preserveAlpha: SVGAnimatedBoolean

    /**
     * The **`targetX`** read-only property of the SVGFEConvolveMatrixElement interface reflects the targetX attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/targetX)
     */
    val targetX: SVGAnimatedInteger

    /**
     * The **`targetY`** read-only property of the SVGFEConvolveMatrixElement interface reflects the targetY attribute of the given <feConvolveMatrix> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEConvolveMatrixElement/targetY)
     */
    val targetY: SVGAnimatedInteger
    val SVG_EDGEMODE_UNKNOWN: EdgeMode
    val SVG_EDGEMODE_DUPLICATE: EdgeMode
    val SVG_EDGEMODE_WRAP: EdgeMode
    val SVG_EDGEMODE_NONE: EdgeMode

    companion object {
        val SVG_EDGEMODE_UNKNOWN: EdgeMode
        val SVG_EDGEMODE_DUPLICATE: EdgeMode
        val SVG_EDGEMODE_WRAP: EdgeMode
        val SVG_EDGEMODE_NONE: EdgeMode
    }

    sealed interface EdgeMode
}
