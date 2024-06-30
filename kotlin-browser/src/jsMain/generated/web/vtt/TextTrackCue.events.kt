// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance

inline val <C : TextTrackCue> C.enterEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.enter())

inline val <C : TextTrackCue> C.exitEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.exit())
