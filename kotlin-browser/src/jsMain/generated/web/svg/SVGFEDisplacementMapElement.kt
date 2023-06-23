// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feDisplacementMap> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement)
 */
sealed external class SVGFEDisplacementMapElement :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    val in1: SVGAnimatedString
    val in2: SVGAnimatedString
    val scale: SVGAnimatedNumber
    val xChannelSelector: SVGAnimatedEnumeration
    val yChannelSelector: SVGAnimatedEnumeration
    val SVG_CHANNEL_UNKNOWN: Short
    val SVG_CHANNEL_R: Short
    val SVG_CHANNEL_G: Short
    val SVG_CHANNEL_B: Short
    val SVG_CHANNEL_A: Short

    companion object {
        val SVG_CHANNEL_UNKNOWN: Short
        val SVG_CHANNEL_R: Short
        val SVG_CHANNEL_G: Short
        val SVG_CHANNEL_B: Short
        val SVG_CHANNEL_A: Short
    }
}
