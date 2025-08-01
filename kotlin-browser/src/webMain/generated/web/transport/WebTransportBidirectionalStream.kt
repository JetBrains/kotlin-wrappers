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
open external class WebTransportBidirectionalStream
private constructor() {
    /**
     * The **`readable`** read-only property of the WebTransportBidirectionalStream interface returns a WebTransportReceiveStream instance that can be used to reliably read incoming data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream/readable)
     */
    val readable: ReadableStream<*>

    /**
     * The **`writable`** read-only property of the WebTransportBidirectionalStream interface returns a WebTransportSendStream instance that can be used to write outgoing data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportBidirectionalStream/writable)
     */
    val writable: WritableStream<*>
}
