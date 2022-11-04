// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit

external interface RTCErrorEventInit : EventInit {
    var error: RTCError
}

open external class RTCErrorEvent(
    type: String,
    init: RTCErrorEventInit,
) : Event {
    val error: RTCError

    companion object
}
