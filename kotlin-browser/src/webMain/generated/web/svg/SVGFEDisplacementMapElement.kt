// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEDisplacementMapElement`** interface corresponds to the feDisplacementMap element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement)
 */
open external class SVGFEDisplacementMapElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFEDisplacementMapElement interface reflects the in attribute of the given feDisplacementMap element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`in2`** read-only property of the SVGFEDisplacementMapElement interface reflects the in2 attribute of the given feDisplacementMap element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/in2)
     */
    val in2: SVGAnimatedString

    /**
     * The **`scale`** read-only property of the SVGFEDisplacementMapElement interface reflects the scale attribute of the given feDisplacementMap element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/scale)
     */
    val scale: SVGAnimatedNumber

    /**
     * The **`xChannelSelector`** read-only property of the SVGFEDisplacementMapElement interface reflects the xChannelSelector attribute of the given feDisplacementMap element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement/xChannelSelector)
     */
    val xChannelSelector: SVGAnimatedEnumeration<ChannelSelector>

    /**
     * The **`yChannelSelector`** read-only property of the SVGFEDisplacementMapElement interface reflects the yChannelSelector attribute of the given feDisplacementMap element.
     *
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
