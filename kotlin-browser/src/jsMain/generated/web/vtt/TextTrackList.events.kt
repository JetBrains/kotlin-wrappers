// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : TextTrackList> C.addTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, EventType("addtrack"))

inline val <C : TextTrackList> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("change"))

inline val <C : TextTrackList> C.removeTrackEvent: EventInstance<TrackEvent, C, C>
    get() = EventInstance(this, EventType("removetrack"))
