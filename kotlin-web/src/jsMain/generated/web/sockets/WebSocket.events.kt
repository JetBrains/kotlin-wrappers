// Automatically generated - do not modify!

package web.sockets

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event)
 */
inline val <C : WebSocket> C.closeEvent: EventInstance<CloseEvent, C, C>
    get() = EventInstance(this, CloseEvent.CLOSE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event)
 */
inline val <C : WebSocket> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event)
 */
inline val <C : WebSocket> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event)
 */
inline val <C : WebSocket> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.OPEN)
