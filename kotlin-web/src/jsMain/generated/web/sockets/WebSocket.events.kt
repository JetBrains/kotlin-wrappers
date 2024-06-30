// Automatically generated - do not modify!

package web.sockets

import web.events.Event
import web.events.EventInstance
import web.events.EventType
import web.messaging.MessageEvent

inline val <C : WebSocket> C.closeEvent: EventInstance<CloseEvent, C, C>
    get() = EventInstance(this, EventType("close"))

inline val <C : WebSocket> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : WebSocket> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("message"))

inline val <C : WebSocket> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("open"))
