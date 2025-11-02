// Automatically generated - do not modify!

package web.transport

import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * The **`WebTransportDatagramDuplexStream`** interface of the WebTransport API represents a duplex stream that can be used for unreliable transport of datagrams between client and server. Provides access to a ReadableStream for reading incoming datagrams, a WritableStream for writing outgoing datagrams, and various settings and statistics related to the stream.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream)
 */
open external class WebTransportDatagramDuplexStream
private constructor() {
    /**
     * The **`incomingHighWaterMark`** property of the WebTransportDatagramDuplexStream interface gets or sets the high water mark for incoming chunks of data — this is the maximum size, in chunks, that the incoming ReadableStream's internal queue can reach before it is considered full. See Internal queues and queuing strategies for more information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingHighWaterMark)
     */
    var incomingHighWaterMark: Double

    /**
     * The **`incomingMaxAge`** property of the WebTransportDatagramDuplexStream interface gets or sets the maximum age for incoming datagrams, in milliseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/incomingMaxAge)
     */
    var incomingMaxAge: Double?

    /**
     * The **`maxDatagramSize`** read-only property of the WebTransportDatagramDuplexStream interface returns the maximum allowable size of outgoing datagrams, in bytes, that can be written to writable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/maxDatagramSize)
     */
    val maxDatagramSize: Int

    /**
     * The **`outgoingHighWaterMark`** property of the WebTransportDatagramDuplexStream interface gets or sets the high water mark for outgoing chunks of data — this is the maximum size, in chunks, that the outgoing WritableStream's internal queue can reach before it is considered full. See Internal queues and queuing strategies for more information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingHighWaterMark)
     */
    var outgoingHighWaterMark: Double

    /**
     * The **`outgoingMaxAge`** property of the WebTransportDatagramDuplexStream interface gets or sets the maximum age for outgoing datagrams, in milliseconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/outgoingMaxAge)
     */
    var outgoingMaxAge: Double?

    /**
     * The **`readable`** read-only property of the WebTransportDatagramDuplexStream interface returns a ReadableStream instance that can be used to unreliably read incoming datagrams from the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/readable)
     */
    val readable: ReadableStream<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportDatagramDuplexStream/writable)
     */
    val writable: WritableStream<*>
}
