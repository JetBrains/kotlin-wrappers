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
    val SVG_PRESERVEASPECTRATIO_UNKNOWN: Align
    val SVG_PRESERVEASPECTRATIO_NONE: Align
    val SVG_PRESERVEASPECTRATIO_XMINYMIN: Align
    val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Align
    val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Align
    val SVG_PRESERVEASPECTRATIO_XMINYMID: Align
    val SVG_PRESERVEASPECTRATIO_XMIDYMID: Align
    val SVG_PRESERVEASPECTRATIO_XMAXYMID: Align
    val SVG_PRESERVEASPECTRATIO_XMINYMAX: Align
    val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Align
    val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Align
    val SVG_MEETORSLICE_UNKNOWN: MeetOrSlice
    val SVG_MEETORSLICE_MEET: MeetOrSlice
    val SVG_MEETORSLICE_SLICE: MeetOrSlice

    companion object {
        val SVG_PRESERVEASPECTRATIO_UNKNOWN: Align
        val SVG_PRESERVEASPECTRATIO_NONE: Align
        val SVG_PRESERVEASPECTRATIO_XMINYMIN: Align
        val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Align
        val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Align
        val SVG_PRESERVEASPECTRATIO_XMINYMID: Align
        val SVG_PRESERVEASPECTRATIO_XMIDYMID: Align
        val SVG_PRESERVEASPECTRATIO_XMAXYMID: Align
        val SVG_PRESERVEASPECTRATIO_XMINYMAX: Align
        val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Align
        val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Align
        val SVG_MEETORSLICE_UNKNOWN: MeetOrSlice
        val SVG_MEETORSLICE_MEET: MeetOrSlice
        val SVG_MEETORSLICE_SLICE: MeetOrSlice
    }

    sealed interface Align
    sealed interface MeetOrSlice
}
