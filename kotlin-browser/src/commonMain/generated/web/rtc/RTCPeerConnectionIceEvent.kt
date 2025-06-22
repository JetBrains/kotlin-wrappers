// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`RTCPeerConnectionIceEvent`** interface represents events that occur in relation to ICE candidates with the target, usually an RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent)
 */
open external class RTCPeerConnectionIceEvent(
    override val type: EventType<RTCPeerConnectionIceEvent>,
    init: RTCPeerConnectionIceEventInit = definedExternally,
) : Event {
    /**
     * The read-only **`candidate`** property of the RTCPeerConnectionIceEvent interface returns the An RTCIceCandidate object representing the ICE candidate that has been received, or `null` to indicate that there are no further candidates for this negotiation session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent/candidate)
     */
    val candidate: RTCIceCandidate?

    companion object
}

inline fun RTCPeerConnectionIceEvent.asInit(): RTCPeerConnectionIceEventInit =
    unsafeCast(this)

inline val RTCPeerConnectionIceEvent.Companion.ICE_CANDIDATE: EventType<RTCPeerConnectionIceEvent>
    get() = EventType("icecandidate")
