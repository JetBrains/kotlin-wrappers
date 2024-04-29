// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feTurbulence> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement)
 */
open external class SVGFETurbulenceElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val baseFrequencyX: SVGAnimatedNumber
    val baseFrequencyY: SVGAnimatedNumber
    val numOctaves: SVGAnimatedInteger
    val seed: SVGAnimatedNumber
    val stitchTiles: SVGAnimatedEnumeration<StitchTiles>
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
