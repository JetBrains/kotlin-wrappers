// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controllerchange_event)
 */
inline val <C : ServiceWorkerContainer> C.controllerChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.controllerChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/message_event)
 */
inline val <C : ServiceWorkerContainer> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/messageerror_event)
 */
inline val <C : ServiceWorkerContainer> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
