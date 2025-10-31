// Automatically generated - do not modify!

package web.rtc

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
     * The read-only **`candidate`** property of the RTCPeerConnectionIceEvent interface returns the RTCIceCandidate associated with the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent/candidate)
     */
    val candidate: RTCIceCandidate?

    companion object
}

inline val RTCPeerConnectionIceEvent.Companion.ICE_CANDIDATE: EventType<RTCPeerConnectionIceEvent>
    get() = EventType("icecandidate")
