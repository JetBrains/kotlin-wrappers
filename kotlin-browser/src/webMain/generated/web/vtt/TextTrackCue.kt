// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`TextTrackCue`** interface of the WebVTT API is the abstract base class for the various derived cue types, such as VTTCue; you will work with these derived types rather than the base class.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue)
 */
open external class TextTrackCue
private constructor() :
    EventTarget {
    /**
     * The **`endTime`** property of the TextTrackCue interface returns and sets the end time of the cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/endTime)
     */
    var endTime: Double

    /**
     * The **`id`** property of the TextTrackCue interface returns and sets the identifier for this cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/id)
     */
    var id: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event)
     */
    var onenter: EventHandler<Event, TextTrackCue, TextTrackCue>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event)
     */
    var onexit: EventHandler<Event, TextTrackCue, TextTrackCue>?

    /**
     * The **`pauseOnExit`** property of the TextTrackCue interface returns or sets the flag indicating whether playback of the media should pause when the end of the range to which this cue applies is reached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/pauseOnExit)
     */
    var pauseOnExit: Boolean

    /**
     * The **`startTime`** property of the TextTrackCue interface returns and sets the start time of the cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/startTime)
     */
    var startTime: Double

    /**
     * The **`track`** read-only property of the TextTrackCue interface returns the TextTrack object that this cue belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/track)
     */
    val track: TextTrack?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event)
 */
inline val <C : TextTrackCue> C.enterEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "enter")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event)
 */
inline val <C : TextTrackCue> C.exitEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "exit")
