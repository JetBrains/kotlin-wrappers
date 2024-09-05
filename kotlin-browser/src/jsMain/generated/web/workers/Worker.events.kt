// Automatically generated - do not modify!

package web.workers

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/error_event)
 */
inline val <C : Worker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event)
 */
inline val <C : Worker> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event)
 */
inline val <C : Worker> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
