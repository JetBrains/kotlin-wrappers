// Automatically generated - do not modify!

package web.sse

import web.events.Event
import web.events.EventInstance
import web.events.EventType
import web.messaging.MessageEvent

inline val <C : EventSource> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : EventSource> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("message"))

inline val <C : EventSource> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("open"))
