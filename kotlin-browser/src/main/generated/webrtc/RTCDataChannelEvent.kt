// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit

external interface RTCDataChannelEventInit : EventInit {
    var channel: RTCDataChannel
}

open external class RTCDataChannelEvent(
    type: String,
    init: RTCDataChannelEventInit,
) : Event {
    val channel: RTCDataChannel

    companion object
}
