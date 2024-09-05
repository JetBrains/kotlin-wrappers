// Automatically generated - do not modify!

package web.broadcast

import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event)
 */
inline val <C : BroadcastChannel> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event)
 */
inline val <C : BroadcastChannel> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
