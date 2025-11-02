// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventType

/**
 * The **`RTCPeerConnectionIceErrorEvent`** interface—based upon the Event interface—provides details pertaining to an ICE error announced by sending an icecandidateerror event to the RTCPeerConnection object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent)
 */
open external class RTCPeerConnectionIceErrorEvent(
    override val type: EventType<RTCPeerConnectionIceErrorEvent>,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    /**
     * The RTCPeerConnectionIceErrorEvent property **`address`** is a string which indicates the local IP address being used to communicate with the STUN or TURN server during negotiations. The error which occurred involved this address.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/address)
     */
    val address: String?
    val errorCode: Short
    val errorText: String
    val port: Short?
    val url: String

    companion object
}

inline val RTCPeerConnectionIceErrorEvent.Companion.ICE_CANDIDATE_ERROR: EventType<RTCPeerConnectionIceErrorEvent>
    get() = EventType("icecandidateerror")
