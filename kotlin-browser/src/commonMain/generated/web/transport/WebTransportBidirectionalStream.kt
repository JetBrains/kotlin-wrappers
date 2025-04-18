// Automatically generated - do not modify!

package web.transport

import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`WebTransportBidirectionalStream`** interface of the WebTransport API represents a bidirectional stream created by a server or a client that can be used for reliable transport.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream)
 */
external class WebTransportBidirectionalStream
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream/readable)
     */
    val readable: ReadableStream<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream/writable)
     */
    val writable: WritableStream<*>
}
