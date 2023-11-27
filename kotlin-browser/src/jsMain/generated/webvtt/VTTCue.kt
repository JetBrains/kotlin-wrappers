// Automatically generated - do not modify!

package webvtt

import web.dom.DocumentFragment

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue) */
external class VTTCue(
    startTime: Number,
    endTime: Number,
    text: String,
) : TextTrackCue {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align) */
    var align: AlignSetting

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/line) */
    var line: LineAndPositionSetting

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign) */
    var lineAlign: LineAlignSetting

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/position) */
    var position: LineAndPositionSetting

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign) */
    var positionAlign: PositionAlignSetting

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/region) */
    var region: VTTRegion?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/size) */
    var size: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/snapToLines) */
    var snapToLines: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/text) */
    var text: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical) */
    var vertical: DirectionSetting

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/getCueAsHTML) */
    fun getCueAsHTML(): DocumentFragment
}
