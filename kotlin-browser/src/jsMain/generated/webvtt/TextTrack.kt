// Automatically generated - do not modify!

package webvtt

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * This interface also inherits properties from EventTarget.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack)
 */
sealed external class TextTrack :
    EventTarget {
    /**
     * Returns the text track cues from the text track list of cues that are currently active (i.e. that start before the current playback position and end after it), as a TextTrackCueList object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/activeCues)
     */
    val activeCues: TextTrackCueList?

    /**
     * Returns the text track list of cues, as a TextTrackCueList object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cues)
     */
    val cues: TextTrackCueList?

    /**
     * Returns the ID of the given track.
     *
     * For in-band tracks, this is the ID that can be used with a fragment if the format supports media fragment syntax, and that can be used with the getTrackById() method.
     *
     * For TextTrack objects corresponding to track elements, this is the ID of the track element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/id)
     */
    val id: String

    /**
     * Returns the text track in-band metadata track dispatch type string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/inBandMetadataTrackDispatchType)
     */
    val inBandMetadataTrackDispatchType: String

    /**
     * Returns the text track kind string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind)
     */
    val kind: TextTrackKind

    /**
     * Returns the text track label, if there is one, or the empty string otherwise (indicating that a custom label probably needs to be generated from the other attributes of the object if the object is exposed to the user).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/label)
     */
    val label: String

    /**
     * Returns the text track language string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/language)
     */
    val language: String

    /**
     * Returns the text track mode, represented by a string from the following list:
     *
     * Can be set, to change the mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode)
     */
    var mode: TextTrackMode

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cuechange_event) */
    var oncuechange: EventHandler<Event>?

    /**
     * Adds the given cue to textTrack's text track list of cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/addCue)
     */
    fun addCue(cue: TextTrackCue)

    /**
     * Removes the given cue from textTrack's text track list of cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/removeCue)
     */
    fun removeCue(cue: TextTrackCue)
}
