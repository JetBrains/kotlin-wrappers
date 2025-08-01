// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEMorphologyElement`** interface corresponds to the feMorphology element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement)
 */
open external class SVGFEMorphologyElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFEMorphologyElement interface reflects the in attribute of the given feMorphology element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`operator`** read-only property of the SVGFEMorphologyElement interface reflects the operator attribute of the given feMorphology element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/operator)
     */
    val operator: SVGAnimatedEnumeration<Operator>

    /**
     * The **`radiusX`** read-only property of the SVGFEMorphologyElement interface reflects the X component of the radius attribute of the given feMorphology element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/radiusX)
     */
    val radiusX: SVGAnimatedNumber

    /**
     * The **`radiusY`** read-only property of the SVGFEMorphologyElement interface reflects the Y component of the radius attribute of the given feMorphology element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEMorphologyElement/radiusY)
     */
    val radiusY: SVGAnimatedNumber
    val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Operator
    val SVG_MORPHOLOGY_OPERATOR_ERODE: Operator
    val SVG_MORPHOLOGY_OPERATOR_DILATE: Operator

    companion object {
        val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Operator
        val SVG_MORPHOLOGY_OPERATOR_ERODE: Operator
        val SVG_MORPHOLOGY_OPERATOR_DILATE: Operator
    }

    sealed interface Operator
}
