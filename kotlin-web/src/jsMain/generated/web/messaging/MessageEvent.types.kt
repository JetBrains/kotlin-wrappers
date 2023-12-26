// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.messaging

import seskar.js.JsValue
import web.events.EventType

sealed external interface MessageEventTypes {
    @JsValue("connect")
    val CONNECT: EventType<MessageEvent<*>>
        get() = definedExternally

    @JsValue("message")
    val MESSAGE: EventType<MessageEvent<*>>
        get() = definedExternally

    @JsValue("messageerror")
    val MESSAGE_ERROR: EventType<MessageEvent<*>>
        get() = definedExternally
}
