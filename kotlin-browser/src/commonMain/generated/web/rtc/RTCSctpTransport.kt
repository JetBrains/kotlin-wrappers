// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`RTCSctpTransport`** interface provides information which describes a Stream Control Transmission Protocol (**SCTP**) transport.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport)
 */
open external class RTCSctpTransport
private constructor() :
    EventTarget {
    /**
     * The **`maxChannels`** read-only property of the RTCSctpTransport interface indicates the maximum number of RTCDataChannel objects that can be opened simultaneously.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxChannels)
     */
    val maxChannels: Short?

    /**
     * The **`maxMessageSize`** read-only property of the RTCSctpTransport interface indicates the maximum size of a message that can be sent using the RTCDataChannel.send() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxMessageSize)
     */
    val maxMessageSize: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/statechange_event)
     */
    var onstatechange: EventHandler<Event, RTCSctpTransport, RTCSctpTransport>?

    /**
     * The **`state`** read-only property of the RTCSctpTransport interface provides information which describes a Stream Control Transmission Protocol (SCTP) transport state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state)
     */
    val state: RTCSctpTransportState

    /**
     * The **`transport`** read-only property of the RTCSctpTransport interface returns a RTCDtlsTransport object representing the DTLS transport used for the transmission and receipt of data packets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/transport)
     */
    val transport: RTCDtlsTransport
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/statechange_event)
 */
inline val <C : RTCSctpTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "statechange")
