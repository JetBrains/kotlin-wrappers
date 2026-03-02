// Automatically generated - do not modify!

package web.transport

import js.promise.Promise
import js.promise.await
import js.typedarrays.Uint8Array
import web.streams.ReadableStream
import kotlin.js.JsName

/**
 * The **`WebTransportReceiveStream`** interface of the WebTransport API is a ReadableStream that can be used to read from an incoming unidirectional or bidirectional WebTransport stream.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportReceiveStream)
 */
open external class WebTransportReceiveStream
private constructor() :
    ReadableStream<Uint8Array<*>> {
    /**
     * The **`getStats()`** method of the WebTransportReceiveStream interface asynchronously returns an object containing statistics for the current stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportReceiveStream/getStats)
     */
    @JsName("getStats")
    fun getStatsAsync(): Promise<WebTransportReceiveStreamStats>
}

/**
 * The **`getStats()`** method of the WebTransportReceiveStream interface asynchronously returns an object containing statistics for the current stream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportReceiveStream/getStats)
 */
suspend inline fun WebTransportReceiveStream.getStats(): WebTransportReceiveStreamStats {
    return getStatsAsync().await()
}
