// Automatically generated - do not modify!

package web.sockets

import seskar.js.JsValue
import web.events.EventType

sealed external class CloseEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("CloseEvent.CLOSE"),
    )
    @JsValue("close")
    fun close(): EventType<CloseEvent>
}
