// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class ExtendableMessageEventTypes :
    ExtendableMessageEventTypes_deprecated {

    @JsValue("message")
    fun <C : EventTarget> message(): EventType<ExtendableMessageEvent<C>>
}
