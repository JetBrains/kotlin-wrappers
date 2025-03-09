// Automatically generated - do not modify!

package web.rtc

import web.events.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport)
 */
external class RTCSctpTransport
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxChannels)
     */
    val maxChannels: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/maxMessageSize)
     */
    val maxMessageSize: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/statechange_event)
     */
    var onstatechange: EventHandler<Event, RTCSctpTransport, RTCSctpTransport>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/state)
     */
    val state: RTCSctpTransportState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/transport)
     */
    val transport: RTCDtlsTransport

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSctpTransport/statechange_event)
     */
    @JsEvent("statechange")
    val stateChangeEvent: EventInstance<Event, RTCSctpTransport /* this */, RTCSctpTransport /* this */>
}
