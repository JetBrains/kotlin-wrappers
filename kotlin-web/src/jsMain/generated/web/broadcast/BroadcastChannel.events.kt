// Automatically generated - do not modify!

package web.broadcast

import web.events.EventInstance
import web.messaging.MessageEvent

inline val <C : BroadcastChannel> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

inline val <C : BroadcastChannel> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())
