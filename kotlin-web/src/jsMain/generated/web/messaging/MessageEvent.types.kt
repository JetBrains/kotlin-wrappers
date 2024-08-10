// Automatically generated - do not modify!

package web.messaging

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class MessageEventTypes {

    @JsValue("connect")
    fun <D, C : EventTarget> connect(): EventType<MessageEvent<D>, C>

    @JsValue("message")
    fun <D, C : EventTarget> message(): EventType<MessageEvent<D>, C>

    @JsValue("messageerror")
    fun <D, C : EventTarget> messageError(): EventType<MessageEvent<D>, C>
}
