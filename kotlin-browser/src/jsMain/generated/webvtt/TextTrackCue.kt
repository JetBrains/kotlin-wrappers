// Automatically generated - do not modify!

package webvtt

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class TextTrackCue :
    EventTarget {
    /**
     * Returns the text track cue end time, in seconds.
     *
     * Can be set.
     */
    var endTime: Double

    /**
     * Returns the text track cue identifier.
     *
     * Can be set.
     */
    var id: String
    var onenter: EventHandler<Event>?
    var onexit: EventHandler<Event>?

    /**
     * Returns true if the text track cue pause-on-exit flag is set, false otherwise.
     *
     * Can be set.
     */
    var pauseOnExit: Boolean

    /**
     * Returns the text track cue start time, in seconds.
     *
     * Can be set.
     */
    var startTime: Double

    /** Returns the TextTrack object to which this text track cue belongs, if any, or null otherwise. */
    val track: TextTrack?
}
