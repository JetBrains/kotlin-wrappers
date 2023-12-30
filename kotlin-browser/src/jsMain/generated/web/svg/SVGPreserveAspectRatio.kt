// Automatically generated - do not modify!

package web.svg

/**
 * Corresponds to the preserveAspectRatio attribute, which is available for some of SVG's elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio)
 */
sealed external class SVGPreserveAspectRatio {
    var align: Align
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
