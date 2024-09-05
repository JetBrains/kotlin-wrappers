// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event)
 */
inline val <C : TextTrackCue> C.enterEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.enter())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event)
 */
inline val <C : TextTrackCue> C.exitEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.exit())
