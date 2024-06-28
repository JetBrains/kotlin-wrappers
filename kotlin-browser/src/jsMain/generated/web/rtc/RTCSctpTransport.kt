// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport)
 */
sealed external class RTCSctpTransport :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxChannels)
     */
    val maxChannels: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxMessageSize)
     */
    val maxMessageSize: Double
    var onstatechange: EventHandler<Event, RTCSctpTransport, EventTarget>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state)
     */
    val state: RTCSctpTransportState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/transport)
     */
    val transport: RTCDtlsTransport
}
