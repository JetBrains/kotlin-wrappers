// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the <feDisplacementMap> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement)
 */
open external class SVGFEDisplacementMapElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/in2)
     */
    val in2: SVGAnimatedString

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/scale)
     */
    val scale: SVGAnimatedNumber

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/xChannelSelector)
     */
    val xChannelSelector: SVGAnimatedEnumeration<ChannelSelector>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/yChannelSelector)
     */
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
