// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webrtc

import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCDataChannelEventInit : EventInit {
    var channel: RTCDataChannel
}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent) */
open external class RTCDataChannelEvent(
    override val type: EventType<RTCDataChannelEvent>,
    init: RTCDataChannelEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent/channel) */
    val channel: RTCDataChannel

    companion object {
        @JsValue("datachannel")
        val DATA_CHANNEL: EventType<RTCDataChannelEvent>
    }
}
