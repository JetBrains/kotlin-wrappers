// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent) */
external interface RTCErrorEventInit : EventInit {
    var error: RTCError
}

open external class RTCErrorEvent(
    override val type: EventType<RTCErrorEvent>,
    init: RTCErrorEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent/error) */
    val error: RTCError

    companion object
}
