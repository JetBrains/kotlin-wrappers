// Automatically generated - do not modify!

package web.messaging

import web.events.EventType

inline val MessageEvent.Companion.MESSAGE: EventType<MessageEvent<*>>
    get() = EventType("message")

inline val MessageEvent.Companion.MESSAGE_ERROR: EventType<MessageEvent<*>>
    get() = EventType("messageerror")
