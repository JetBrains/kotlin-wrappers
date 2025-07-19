// Automatically generated - do not modify!

package web.transport

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.streams.ReadableStream
import web.streams.WritableStream
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`WebTransport`** interface of the WebTransport API provides functionality to enable a user agent to connect to an HTTP/3 server, initiate reliable and unreliable transport in either or both directions, and close the connection once it is no longer needed.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport)
 */
open external class WebTransport(
    url: String,
    options: WebTransportOptions = definedExternally,
) {
    constructor(
        url: URL,
        options: WebTransportOptions = definedExternally,
    )

    /**
     * The **`closed`** read-only property of the WebTransport interface returns a promise that resolves when the transport is closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/closed)
     */
    val closed: Promise<WebTransportCloseInfo>

    /**
     * The **`datagrams`** read-only property of the WebTransport interface returns a WebTransportDatagramDuplexStream instance that can be used to send and receive datagrams — unreliable data transmission.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/datagrams)
     */
    val datagrams: WebTransportDatagramDuplexStream

    /**
     * The **`incomingBidirectionalStreams`** read-only property of the WebTransport interface represents one or more bidirectional streams opened by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/incomingBidirectionalStreams)
     */
    val incomingBidirectionalStreams: ReadableStream<*>

    /**
     * The **`incomingUnidirectionalStreams`** read-only property of the WebTransport interface represents one or more unidirectional streams opened by the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/incomingUnidirectionalStreams)
     */
    val incomingUnidirectionalStreams: ReadableStream<*>

    /**
     * The **`ready`** read-only property of the WebTransport interface returns a promise that resolves when the transport is ready to use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/ready)
     */
    val ready: Promise<Void>

    /**
     * The **`close()`** method of the WebTransport interface closes an ongoing WebTransport session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/close)
     */
    fun close(closeInfo: WebTransportCloseInfo = definedExternally)

    /**
     * The **`createBidirectionalStream()`** method of the WebTransport interface asynchronously opens and returns a bidirectional stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createBidirectionalStream)
     */
    @JsName("createBidirectionalStream")
    fun createBidirectionalStreamAsync(options: WebTransportSendStreamOptions = definedExternally): Promise<WebTransportBidirectionalStream>

    /**
     * The **`createUnidirectionalStream()`** method of the WebTransport interface asynchronously opens a unidirectional stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createUnidirectionalStream)
     */
    @JsName("createUnidirectionalStream")
    fun createUnidirectionalStreamAsync(options: WebTransportSendStreamOptions = definedExternally): Promise<WritableStream<*>>
}

/**
 * The **`createBidirectionalStream()`** method of the WebTransport interface asynchronously opens and returns a bidirectional stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createBidirectionalStream)
 */
suspend inline fun WebTransport.createBidirectionalStream(options: WebTransportSendStreamOptions): WebTransportBidirectionalStream {
    return createBidirectionalStreamAsync(
        options = options,
    ).await()
}

/**
 * The **`createBidirectionalStream()`** method of the WebTransport interface asynchronously opens and returns a bidirectional stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createBidirectionalStream)
 */
suspend inline fun WebTransport.createBidirectionalStream(): WebTransportBidirectionalStream {
    return createBidirectionalStreamAsync().await()
}

/**
 * The **`createUnidirectionalStream()`** method of the WebTransport interface asynchronously opens a unidirectional stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createUnidirectionalStream)
 */
suspend inline fun WebTransport.createUnidirectionalStream(options: WebTransportSendStreamOptions): WritableStream<*> {
    return createUnidirectionalStreamAsync(
        options = options,
    ).await()
}

/**
 * The **`createUnidirectionalStream()`** method of the WebTransport interface asynchronously opens a unidirectional stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createUnidirectionalStream)
 */
suspend inline fun WebTransport.createUnidirectionalStream(): WritableStream<*> {
    return createUnidirectionalStreamAsync().await()
}
