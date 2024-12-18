// Automatically generated - do not modify!

package web.vtt

import js.array.ArrayLike
import js.iterable.JsIterable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList)
 */
external class TextTrackCueList
private constructor() :
    ArrayLike<TextTrackCue>,
    JsIterable<TextTrackCue> {
    /**
     * Returns the number of cues in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList/length)
     */
    val length: UInt

    /**
     * Returns the first text track cue (in text track cue order) with text track cue identifier id.
     *
     * Returns null if none of the cues have the given identifier or if the argument is the empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList/getCueById)
     */
    fun getCueById(id: String): TextTrackCue?
}
