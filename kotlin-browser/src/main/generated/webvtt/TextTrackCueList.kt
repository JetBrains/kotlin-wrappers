// Automatically generated - do not modify!

package webvtt

import kotlinx.js.ArrayLike

sealed external class TextTrackCueList :
    ArrayLike<TextTrackCue> {
    /**
     * Returns the first text track cue (in text track cue order) with text track cue identifier id.
     *
     * Returns null if none of the cues have the given identifier or if the argument is the empty string.
     */
    fun getCueById(id: String): TextTrackCue?
}
