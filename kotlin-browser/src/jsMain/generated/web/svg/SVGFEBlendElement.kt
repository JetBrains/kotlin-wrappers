// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feBlend> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement)
 */
open external class SVGFEBlendElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val in2: SVGAnimatedString
    val mode: SVGAnimatedEnumeration<Mode>
    val SVG_FEBLEND_MODE_UNKNOWN: Mode
    val SVG_FEBLEND_MODE_NORMAL: Mode
    val SVG_FEBLEND_MODE_MULTIPLY: Mode
    val SVG_FEBLEND_MODE_SCREEN: Mode
    val SVG_FEBLEND_MODE_DARKEN: Mode
    val SVG_FEBLEND_MODE_LIGHTEN: Mode
    val SVG_FEBLEND_MODE_OVERLAY: Mode
    val SVG_FEBLEND_MODE_COLOR_DODGE: Mode
    val SVG_FEBLEND_MODE_COLOR_BURN: Mode
    val SVG_FEBLEND_MODE_HARD_LIGHT: Mode
    val SVG_FEBLEND_MODE_SOFT_LIGHT: Mode
    val SVG_FEBLEND_MODE_DIFFERENCE: Mode
    val SVG_FEBLEND_MODE_EXCLUSION: Mode
    val SVG_FEBLEND_MODE_HUE: Mode
    val SVG_FEBLEND_MODE_SATURATION: Mode
    val SVG_FEBLEND_MODE_COLOR: Mode
    val SVG_FEBLEND_MODE_LUMINOSITY: Mode

    companion object {
        val SVG_FEBLEND_MODE_UNKNOWN: Mode
        val SVG_FEBLEND_MODE_NORMAL: Mode
        val SVG_FEBLEND_MODE_MULTIPLY: Mode
        val SVG_FEBLEND_MODE_SCREEN: Mode
        val SVG_FEBLEND_MODE_DARKEN: Mode
        val SVG_FEBLEND_MODE_LIGHTEN: Mode
        val SVG_FEBLEND_MODE_OVERLAY: Mode
        val SVG_FEBLEND_MODE_COLOR_DODGE: Mode
        val SVG_FEBLEND_MODE_COLOR_BURN: Mode
        val SVG_FEBLEND_MODE_HARD_LIGHT: Mode
        val SVG_FEBLEND_MODE_SOFT_LIGHT: Mode
        val SVG_FEBLEND_MODE_DIFFERENCE: Mode
        val SVG_FEBLEND_MODE_EXCLUSION: Mode
        val SVG_FEBLEND_MODE_HUE: Mode
        val SVG_FEBLEND_MODE_SATURATION: Mode
        val SVG_FEBLEND_MODE_COLOR: Mode
        val SVG_FEBLEND_MODE_LUMINOSITY: Mode
    }

    sealed interface Mode
}
