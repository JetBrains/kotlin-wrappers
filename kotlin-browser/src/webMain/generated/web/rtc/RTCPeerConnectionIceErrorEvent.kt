// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventType

/**
 * The **`RTCPeerConnectionIceErrorEvent`** interface of the WebRTC API describes an error that occurred while handling ICE negotiation through a STUN or TURN server.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent)
 */
open external class RTCPeerConnectionIceErrorEvent(
    override val type: EventType<RTCPeerConnectionIceErrorEvent>,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    /**
     * The **`address`** property of the RTCPeerConnectionIceErrorEvent interface is a string that indicates the local IP address used to communicate with the STUN or TURN server when the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/address)
     */
    open val address: String?

    /**
     * The **`errorCode`** property of the RTCPeerConnectionIceErrorEvent interface represents the STUN error code returned by the STUN or TURN server if there was an error during ICE negotiation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/errorCode)
     */
    open val errorCode: Short

    /**
     * The **`errorText`** property of the RTCPeerConnectionIceErrorEvent interface represents the STUN error reason text returned by the STUN or TURN server if there was an error during ICE negotiation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/errorText)
     */
    open val errorText: String

    /**
     * The **`port`** property of the RTCPeerConnectionIceErrorEvent interface represents the port number over which communication with the STUN or TURN server is taking place.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/port)
     */
    open val port: Short?

    /**
     * The **`url`** property of the RTCPeerConnectionIceErrorEvent interface is a string indicating the URL of the STUN or TURN server with which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/url)
     */
    open val url: String

    companion object
}

inline val RTCPeerConnectionIceErrorEvent.Companion.ICE_CANDIDATE_ERROR: EventType<RTCPeerConnectionIceErrorEvent>
    get() = EventType("icecandidateerror")
