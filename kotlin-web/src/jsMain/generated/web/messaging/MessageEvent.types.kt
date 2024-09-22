// Automatically generated - do not modify!

package web.messaging

import seskar.js.JsValue
import web.events.EventType

sealed external class MessageEventTypes {

    @JsValue("connect")
    val CONNECT: EventType<MessageEvent<*>>

    @JsValue("message")
    val MESSAGE: EventType<MessageEvent<*>>

    @JsValue("messageerror")
    val MESSAGE_ERROR: EventType<MessageEvent<*>>
}
