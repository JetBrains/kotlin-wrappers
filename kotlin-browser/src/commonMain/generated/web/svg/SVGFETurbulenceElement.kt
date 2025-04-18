// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFETurbulenceElement`** interface corresponds to the feTurbulence element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement)
 */
open external class SVGFETurbulenceElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/baseFrequencyX)
     */
    val baseFrequencyX: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/baseFrequencyY)
     */
    val baseFrequencyY: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/numOctaves)
     */
    val numOctaves: SVGAnimatedInteger

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/seed)
     */
    val seed: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement/stitchTiles)
     */
    val stitchTiles: SVGAnimatedEnumeration<StitchTiles>

    /**
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
