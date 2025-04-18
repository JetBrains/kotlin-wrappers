// Automatically generated - do not modify!

package web.vtt

import web.dom.DocumentFragment

/**
 * The `VTTCue` interface of the WebVTT API represents a cue that can be added to the text track associated with a particular video (or other media).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue)
 */
open external class VTTCue(
    startTime: Double,
    endTime: Double,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/text)
     */
    var text: String,
) : TextTrackCue {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align)
     */
    var align: AlignSetting

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/line)
     */
    var line: LineAndPositionSetting

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign)
     */
    var lineAlign: LineAlignSetting

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/position)
     */
    var position: LineAndPositionSetting

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign)
     */
    var positionAlign: PositionAlignSetting

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/region)
     */
    var region: VTTRegion?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/size)
     */
    var size: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/snapToLines)
     */
    var snapToLines: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical)
     */
    var vertical: DirectionSetting

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/getCueAsHTML)
     */
    fun getCueAsHTML(): DocumentFragment
}
