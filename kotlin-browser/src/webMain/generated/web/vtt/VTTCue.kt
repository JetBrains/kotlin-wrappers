// Automatically generated - do not modify!

package web.vtt

import web.dom.DocumentFragment

/**
 * The **`VTTCue`** interface of the WebVTT API represents a cue that can be added to the text track associated with a particular video (or other media).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue)
 */
open external class VTTCue(
    startTime: Double,
    endTime: Double,
    /**
     * The **`text`** property of the VTTCue interface represents the text contents of the cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/text)
     */
    var text: String,
) : TextTrackCue {
    /**
     * The **`align`** property of the VTTCue interface represents the alignment of all of the lines of text in the text box.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align)
     */
    var align: AlignSetting

    /**
     * The **`line`** property of the VTTCue interface represents the cue line of this WebVTT cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/line)
     */
    var line: LineAndPositionSetting

    /**
     * The **`lineAlign`** property of the VTTCue interface represents the alignment of this VTT cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign)
     */
    var lineAlign: LineAlignSetting

    /**
     * The **`position`** property of the VTTCue interface represents the indentation of the cue within the line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/position)
     */
    var position: LineAndPositionSetting

    /**
     * The **`positionAlign`** property of the VTTCue interface is used to determine what VTTCue.position is anchored to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign)
     */
    var positionAlign: PositionAlignSetting

    /**
     * The **`region`** property of the VTTCue interface returns and sets the VTTRegion that this cue belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/region)
     */
    var region: VTTRegion?

    /**
     * The **`size`** property of the VTTCue interface represents the size of the cue as a percentage of the video size.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/size)
     */
    var size: Double

    /**
     * The **`snapToLines`** property of the VTTCue interface is a Boolean indicating if the VTTCue.line property is an integer number of lines, or a percentage of the video size.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/snapToLines)
     */
    var snapToLines: Boolean

    /**
     * The **`vertical`** property of the VTTCue interface is a string representing the cue's writing direction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical)
     */
    var vertical: DirectionSetting

    /**
     * The **`getCueAsHTML()`** method of the VTTCue interface returns a DocumentFragment containing the cue content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/getCueAsHTML)
     */
    fun getCueAsHTML(): DocumentFragment
}
