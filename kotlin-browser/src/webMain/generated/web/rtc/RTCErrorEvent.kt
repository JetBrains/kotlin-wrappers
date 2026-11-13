// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventType

/**
 * The **`RTCErrorEvent`** interface of the WebRTC API represents an error event sent to a WebRTC object. It inherits from the standard Event interface, adding RTC-specific information describing the error.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent)
 */
open external class RTCErrorEvent(
    override val type: EventType<RTCErrorEvent>,
    init: RTCErrorEventInit,
) : Event {
    /**
     * The **`error`** read-only property of the RTCErrorEvent interface contains an RTCError object that describes the WebRTC-specific details of the error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent/error)
     */
    open val error: RTCError

    companion object
}

inline val RTCErrorEvent.Companion.ERROR: EventType<RTCErrorEvent>
    get() = EventType("error")
