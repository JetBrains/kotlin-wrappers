// Automatically generated - do not modify!

package web.messaging

import web.events.Event
import web.events.EventInstance

inline val <C : MessagePort> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())

inline val <C : MessagePort> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

inline val <C : MessagePort> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
