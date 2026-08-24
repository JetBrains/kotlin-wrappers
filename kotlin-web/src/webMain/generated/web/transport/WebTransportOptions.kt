// Automatically generated - do not modify!

package web.transport

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/WebTransport#options)
 */
@JsPlainObject
external interface WebTransportOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/WebTransport#allowpooling)
     */
    var allowPooling: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/WebTransport#congestioncontrol)
     */
    var congestionControl: WebTransportCongestionControl?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/WebTransport#protocols)
     */
    var protocols: ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/WebTransport#requireunreliable)
     */
    var requireUnreliable: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/WebTransport#servercertificatehashes)
     */
    var serverCertificateHashes: ReadonlyArray<WebTransportHash>?
}
