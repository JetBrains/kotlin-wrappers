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
    val xChannelSelector: SVGAnimatedEnumeration<ChannelSelector>
    val yChannelSelector: SVGAnimatedEnumeration<ChannelSelector>
    val SVG_CHANNEL_UNKNOWN: ChannelSelector
    val SVG_CHANNEL_R: ChannelSelector
    val SVG_CHANNEL_G: ChannelSelector
    val SVG_CHANNEL_B: ChannelSelector
    val SVG_CHANNEL_A: ChannelSelector

    companion object {
        val SVG_CHANNEL_UNKNOWN: ChannelSelector
        val SVG_CHANNEL_R: ChannelSelector
        val SVG_CHANNEL_G: ChannelSelector
        val SVG_CHANNEL_B: ChannelSelector
        val SVG_CHANNEL_A: ChannelSelector
    }

    sealed interface ChannelSelector
}
