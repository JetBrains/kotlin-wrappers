// Automatically generated - do not modify!

package web.media.streams

import web.events.Event
import web.events.EventInstance

inline val <C : MediaStreamTrack> C.endedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ended())

inline val <C : MediaStreamTrack> C.muteEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.mute())

inline val <C : MediaStreamTrack> C.unmuteEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.unmute())
