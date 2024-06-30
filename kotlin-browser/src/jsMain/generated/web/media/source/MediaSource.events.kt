// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance

inline val <C : MediaSource> C.sourceCloseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.sourceClose())

inline val <C : MediaSource> C.sourceEndedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.sourceEnded())

inline val <C : MediaSource> C.sourceOpenEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.sourceOpen())
