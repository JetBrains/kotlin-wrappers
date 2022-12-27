// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCErrorEventInit : EventInit {
    var error: RTCError
}

open external class RTCErrorEvent(
    type: EventType<RTCErrorEvent>,
    init: RTCErrorEventInit,
) : Event {
    val error: RTCError

    companion object
}
