// Automatically generated - do not modify!

package web.sse

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event)
 */
inline val <C : EventSource> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event)
 */
inline val <C : EventSource> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event)
 */
inline val <C : EventSource> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.open())
