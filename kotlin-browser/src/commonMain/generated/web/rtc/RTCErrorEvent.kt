// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * The WebRTC API's **`RTCErrorEvent`** interface represents an error sent to a WebRTC object.
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

    @JsAlias(THIS)
    override fun asInit(): RTCErrorEventInit

    companion object {
        @JsValue("error")
        val ERROR: EventType<RTCErrorEvent>
    }
}
