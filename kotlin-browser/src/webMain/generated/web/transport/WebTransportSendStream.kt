// Automatically generated - do not modify!

package web.transport

import js.numbers.Int53
import js.promise.Promise
import js.promise.await
import js.typedarrays.Uint8Array
import web.streams.WritableStream
import kotlin.js.JsName

/**
 * The **`WebTransportSendStream`** interface of the WebTransport API is a specialized WritableStream that is used to send outbound data in both unidirectional or bidirectional WebTransport streams.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendStream)
 */
open external class WebTransportSendStream
private constructor() :
    WritableStream<Uint8Array<*>> {
    /**
     * The **`sendOrder`** property of the WebTransportSendStream interface indicates the send priority of this stream relative to other streams for which the value has been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendStream/sendOrder)
     */
    var sendOrder: Int53

    /**
     * The **`getStats()`** method of the WebTransportSendStream interface asynchronously returns an object containing statistics for the current stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendStream/getStats)
     */
    @JsName("getStats")
    fun getStatsAsync(): Promise<WebTransportSendStreamStats>
}

/**
 * The **`getStats()`** method of the WebTransportSendStream interface asynchronously returns an object containing statistics for the current stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendStream/getStats)
 */
suspend inline fun WebTransportSendStream.getStats(): WebTransportSendStreamStats {
    return getStatsAsync().await()
}
