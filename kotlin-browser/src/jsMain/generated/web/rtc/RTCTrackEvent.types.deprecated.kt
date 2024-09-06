// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCTrackEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("RTCTrackEvent.TRACK"),
    )
    @JsValue("track")
    fun track(): EventType<RTCTrackEvent>
}
