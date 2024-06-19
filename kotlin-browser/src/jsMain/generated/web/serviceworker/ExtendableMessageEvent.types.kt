// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class ExtendableMessageEventTypes {

    @JsValue("message")
    fun <C : EventTarget> message(): EventType<ExtendableMessageEvent, C>
}
