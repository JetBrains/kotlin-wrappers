// Automatically generated - do not modify!

package web.transport

import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`WebTransportDatagramDuplexStream`** interface of the WebTransport API represents a duplex stream that can be used for unreliable transport of datagrams between client and server.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream)
 */
external class WebTransportDatagramDuplexStream
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingHighWaterMark)
     */
    var incomingHighWaterMark: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingMaxAge)
     */
    var incomingMaxAge: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/maxDatagramSize)
     */
    val maxDatagramSize: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingHighWaterMark)
     */
    var outgoingHighWaterMark: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingMaxAge)
     */
    var outgoingMaxAge: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/readable)
     */
    val readable: ReadableStream<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/writable)
     */
    val writable: WritableStream<*>
}
