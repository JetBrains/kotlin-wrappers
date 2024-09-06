// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCErrorEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("RTCErrorEvent.ERROR"),
    )
    @JsValue("error")
    fun error(): EventType<RTCErrorEvent>
}
