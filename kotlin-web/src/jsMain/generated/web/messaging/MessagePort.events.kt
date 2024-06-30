// Automatically generated - do not modify!

package web.messaging

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : MessagePort> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("close"))

inline val <C : MessagePort> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("message"))

inline val <C : MessagePort> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("messageerror"))
