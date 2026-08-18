// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGPreserveAspectRatio`** interface corresponds to the preserveAspectRatio attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio)
 */
open external class SVGPreserveAspectRatio
private constructor() {
    /**
     * The **`align`** read-only property of the SVGPreserveAspectRatio interface reflects the type of the alignment value as specified by one of the SVG_PRESERVEASPECTRATIO_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio/align)
     */
    var align: Align

    /**
     * The **`meetOrSlice`** read-only property of the SVGPreserveAspectRatio interface reflects the type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio/meetOrSlice)
     */
    var meetOrSlice: MeetOrSlice

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_unknown)
         */
        val SVG_PRESERVEASPECTRATIO_UNKNOWN: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_none)
         */
        val SVG_PRESERVEASPECTRATIO_NONE: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xminymin)
         */
        val SVG_PRESERVEASPECTRATIO_XMINYMIN: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xmidymin)
         */
        val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xmaxymin)
         */
        val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xminymid)
         */
        val SVG_PRESERVEASPECTRATIO_XMINYMID: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xmidymid)
         */
        val SVG_PRESERVEASPECTRATIO_XMIDYMID: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xmaxymid)
         */
        val SVG_PRESERVEASPECTRATIO_XMAXYMID: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xminymax)
         */
        val SVG_PRESERVEASPECTRATIO_XMINYMAX: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xmidymax)
         */
        val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_preserveaspectratio_xmaxymax)
         */
        val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Align

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_meetorslice_unknown)
         */
        val SVG_MEETORSLICE_UNKNOWN: MeetOrSlice

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_meetorslice_meet)
         */
        val SVG_MEETORSLICE_MEET: MeetOrSlice

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio#svg_meetorslice_slice)
         */
        val SVG_MEETORSLICE_SLICE: MeetOrSlice
    }

    sealed /* enum */
    interface Align

    sealed /* enum */
    interface MeetOrSlice
}
