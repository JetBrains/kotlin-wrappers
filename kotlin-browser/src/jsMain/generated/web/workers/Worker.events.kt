// Automatically generated - do not modify!

package web.workers

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

inline val <C : Worker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : Worker> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

inline val <C : Worker> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
