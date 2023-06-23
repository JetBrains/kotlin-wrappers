// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport) */
sealed external class RTCSctpTransport :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxChannels) */
    val maxChannels: Number?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxMessageSize) */
    val maxMessageSize: Number
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state) */
    val state: RTCSctpTransportState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/transport) */
    val transport: RTCDtlsTransport
}
