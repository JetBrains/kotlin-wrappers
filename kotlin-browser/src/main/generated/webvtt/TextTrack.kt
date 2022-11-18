// Automatically generated - do not modify!

package webvtt

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class TextTrack :
    EventTarget {
    /** Returns the text track cues from the text track list of cues that are currently active (i.e. that start before the current playback position and end after it), as a TextTrackCueList object. */
    val activeCues: TextTrackCueList?

    /** Returns the text track list of cues, as a TextTrackCueList object. */
    val cues: TextTrackCueList?

    /**
     * Returns the ID of the given track.
     *
     * For in-band tracks, this is the ID that can be used with a fragment if the format supports media fragment syntax, and that can be used with the getTrackById() method.
     *
     * For TextTrack objects corresponding to track elements, this is the ID of the track element.
     */
    val id: String

    /** Returns the text track in-band metadata track dispatch type string. */
    val inBandMetadataTrackDispatchType: String

    /** Returns the text track kind string. */
    val kind: TextTrackKind

    /** Returns the text track label, if there is one, or the empty string otherwise (indicating that a custom label probably needs to be generated from the other attributes of the object if the object is exposed to the user). */
    val label: String

    /** Returns the text track language string. */
    val language: String

    /**
     * Returns the text track mode, represented by a string from the following list:
     *
     * Can be set, to change the mode.
     */
    var mode: TextTrackMode
    var oncuechange: EventHandler<Event>?

    /** Adds the given cue to textTrack's text track list of cues. */
    fun addCue(cue: TextTrackCue)

    /** Removes the given cue from textTrack's text track list of cues. */
    fun removeCue(cue: TextTrackCue)
}
