// Automatically generated - do not modify!

package web.transport

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#return_value)
 */
@JsPlainObject
external interface WebTransportConnectionStats {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#bytesreceived)
     */
    var bytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#datagrams)
     */
    var datagrams: WebTransportDatagramStats

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#minrtt)
     */
    var minRtt: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#packetslost)
     */
    var packetsLost: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#packetsreceived)
     */
    var packetsReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#packetssent)
     */
    var packetsSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#rttvariation)
     */
    var rttVariation: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/getStats#smoothedrtt)
     */
    var smoothedRtt: DOMHighResTimeStamp?
}
