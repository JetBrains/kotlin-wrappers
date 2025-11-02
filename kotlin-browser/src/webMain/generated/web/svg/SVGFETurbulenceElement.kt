// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFETurbulenceElement`** interface corresponds to the <feTurbulence> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement)
 */
open external class SVGFETurbulenceElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`baseFrequencyX`** read-only property of the SVGFETurbulenceElement interface reflects the X component of the baseFrequency attribute of the given <feTurbulence> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/baseFrequencyX)
     */
    val baseFrequencyX: SVGAnimatedNumber

    /**
     * The **`baseFrequencyY`** read-only property of the SVGFETurbulenceElement interface reflects the Y component of the baseFrequency attribute of the given <feTurbulence> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/baseFrequencyY)
     */
    val baseFrequencyY: SVGAnimatedNumber

    /**
     * The **`numOctaves`** read-only property of the SVGFETurbulenceElement interface reflects the numOctaves attribute of the given <feTurbulence> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/numOctaves)
     */
    val numOctaves: SVGAnimatedInteger

    /**
     * The **`seed`** read-only property of the SVGFETurbulenceElement interface reflects the seed attribute of the given <feTurbulence> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/seed)
     */
    val seed: SVGAnimatedNumber

    /**
     * The **`stitchTiles`** read-only property of the SVGFETurbulenceElement interface reflects the stitchTiles attribute of the given <feTurbulence> element. It takes one of the SVG_STITCHTYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/stitchTiles)
     */
    val stitchTiles: SVGAnimatedEnumeration<StitchTiles>

    /**
     * The **`type`** read-only property of the SVGFETurbulenceElement interface reflects the type attribute of the given <feTurbulence> element. It takes one of the SVG_TURBULENCE_TYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/type)
     */
    val type: SVGAnimatedEnumeration<Type>
    val SVG_TURBULENCE_TYPE_UNKNOWN: Type
    val SVG_TURBULENCE_TYPE_FRACTALNOISE: Type
    val SVG_TURBULENCE_TYPE_TURBULENCE: Type
    val SVG_STITCHTYPE_UNKNOWN: StitchTiles
    val SVG_STITCHTYPE_STITCH: StitchTiles
    val SVG_STITCHTYPE_NOSTITCH: StitchTiles

    companion object {
        val SVG_TURBULENCE_TYPE_UNKNOWN: Type
        val SVG_TURBULENCE_TYPE_FRACTALNOISE: Type
        val SVG_TURBULENCE_TYPE_TURBULENCE: Type
        val SVG_STITCHTYPE_UNKNOWN: StitchTiles
        val SVG_STITCHTYPE_STITCH: StitchTiles
        val SVG_STITCHTYPE_NOSTITCH: StitchTiles
    }

    sealed interface StitchTiles
    sealed interface Type
}
