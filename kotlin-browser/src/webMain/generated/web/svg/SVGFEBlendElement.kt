// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGFEBlendElement`** interface corresponds to the <feBlend> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement)
 */
open external class SVGFEBlendElement
private constructor() :
    SVGElement,
    SVGFilterPrimitiveStandardAttributes {
    /**
     * The **`in1`** read-only property of the SVGFEBlendElement interface reflects the in attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement/in1)
     */
    val in1: SVGAnimatedString

    /**
     * The **`in2`** read-only property of the SVGFEBlendElement interface reflects the in2 attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement/in2)
     */
    val in2: SVGAnimatedString

    /**
     * The **`mode`** read-only property of the SVGFEBlendElement interface reflects the mode attribute of the given element. It takes one of the SVG_FEBLEND_MODE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement/mode)
     */
    val mode: SVGAnimatedEnumeration<Mode>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_unknown)
         */
        val SVG_FEBLEND_MODE_UNKNOWN: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_normal)
         */
        val SVG_FEBLEND_MODE_NORMAL: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_multiply)
         */
        val SVG_FEBLEND_MODE_MULTIPLY: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_screen)
         */
        val SVG_FEBLEND_MODE_SCREEN: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_darken)
         */
        val SVG_FEBLEND_MODE_DARKEN: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_lighten)
         */
        val SVG_FEBLEND_MODE_LIGHTEN: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_overlay)
         */
        val SVG_FEBLEND_MODE_OVERLAY: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_color_dodge)
         */
        val SVG_FEBLEND_MODE_COLOR_DODGE: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_color_burn)
         */
        val SVG_FEBLEND_MODE_COLOR_BURN: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_hard_light)
         */
        val SVG_FEBLEND_MODE_HARD_LIGHT: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_soft_light)
         */
        val SVG_FEBLEND_MODE_SOFT_LIGHT: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_difference)
         */
        val SVG_FEBLEND_MODE_DIFFERENCE: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_exclusion)
         */
        val SVG_FEBLEND_MODE_EXCLUSION: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_hue)
         */
        val SVG_FEBLEND_MODE_HUE: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_saturation)
         */
        val SVG_FEBLEND_MODE_SATURATION: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_color)
         */
        val SVG_FEBLEND_MODE_COLOR: Mode

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEBlendElement#svg_feblend_mode_luminosity)
         */
        val SVG_FEBLEND_MODE_LUMINOSITY: Mode
    }

    sealed /* enum */
    interface Mode
}
