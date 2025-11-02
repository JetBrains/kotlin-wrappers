// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventType

/**
 * The WebRTC API's **`RTCErrorEvent`** interface represents an error sent to a WebRTC object. It's based on the standard Event interface, but adds RTC-specific information describing the error, as shown below.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent)
 */
open external class RTCErrorEvent(
    override val type: EventType<RTCErrorEvent>,
    init: RTCErrorEventInit,
) : Event {
    /**
     * The read-only RTCErrorEvent property **`error`** contains an RTCError object describing the details of the error which the event is announcing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent/error)
     */
    val error: RTCError

    companion object
}

inline val RTCErrorEvent.Companion.ERROR: EventType<RTCErrorEvent>
    get() = EventType("error")
