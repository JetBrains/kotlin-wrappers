// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCDataChannelEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("RTCDataChannelEvent.DATA_CHANNEL"),
    )
    @JsValue("datachannel")
    fun dataChannel(): EventType<RTCDataChannelEvent>
}
