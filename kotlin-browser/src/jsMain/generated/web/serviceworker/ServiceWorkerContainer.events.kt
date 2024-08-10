// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

inline val <C : ServiceWorkerContainer> C.controllerChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.controllerChange())

inline val <C : ServiceWorkerContainer> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

inline val <C : ServiceWorkerContainer> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
