// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCDataChannelEventInit : EventInit {
    var channel: RTCDataChannel
}

open external class RTCDataChannelEvent(
    type: EventType<RTCDataChannelEvent>,
    init: RTCDataChannelEventInit,
) : Event {
    val channel: RTCDataChannel

    companion object
}
