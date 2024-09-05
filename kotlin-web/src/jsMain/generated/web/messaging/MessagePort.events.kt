// Automatically generated - do not modify!

package web.messaging

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close_event)
 */
inline val <C : MessagePort> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/message_event)
 */
inline val <C : MessagePort> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/messageerror_event)
 */
inline val <C : MessagePort> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
