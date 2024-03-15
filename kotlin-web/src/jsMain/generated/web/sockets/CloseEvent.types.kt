// Automatically generated - do not modify!

package web.sockets

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class CloseEventTypes {

    @JsValue("close")
    fun <C : EventTarget> close(): EventType<CloseEvent, C>
}
