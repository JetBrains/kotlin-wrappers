// Automatically generated - do not modify!

package web.messaging

import seskar.js.JsValue
import web.events.EventType

sealed external class MessageEventTypes_deprecated {

    @JsValue("connect")
    fun <D> connect(): EventType<MessageEvent<D>>

    @JsValue("message")
    fun <D> message(): EventType<MessageEvent<D>>

    @JsValue("messageerror")
    fun <D> messageError(): EventType<MessageEvent<D>>
}
