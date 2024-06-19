// Automatically generated - do not modify!

package web.sockets

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class CloseEventTypes {

    @JsValue("close")
    fun <C : EventTarget> close(): EventType<CloseEvent, C>
}
