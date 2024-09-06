// Automatically generated - do not modify!

package web.messaging

import seskar.js.JsValue
import web.events.EventType

sealed external class MessageEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MessageEvent.CONNECT"),
    )
    @JsValue("connect")
    fun <D> connect(): EventType<MessageEvent<D>>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MessageEvent.MESSAGE"),
    )
    @JsValue("message")
    fun <D> message(): EventType<MessageEvent<D>>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MessageEvent.MESSAGE_ERROR"),
    )
    @JsValue("messageerror")
    fun <D> messageError(): EventType<MessageEvent<D>>
}
