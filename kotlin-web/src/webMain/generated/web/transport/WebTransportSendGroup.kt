// Automatically generated - do not modify!

package web.transport

import js.promise.Promise
import js.promise.await

/**
 * The **`WebTransportSendGroup`** interface of the WebTransport API represents a group of streams and datagrams, within which relative send priority is determined by the sendOrder value of each member.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendGroup)
 */
open external class WebTransportSendGroup
private constructor() {
    /**
     * The **`getStats()`** method of the WebTransportSendGroup interface returns a Promise that resolves to an object containing statistics aggregated across all of the WebTransportSendStream objects currently associated with this group. That is, every stream whose sendGroup is set to this WebTransportSendGroup.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendGroup/getStats)
     */
    @JsName("getStats")
    open fun getStatsAsync(): Promise<WebTransportSendStreamStats>
}

/**
 * The **`getStats()`** method of the WebTransportSendGroup interface returns a Promise that resolves to an object containing statistics aggregated across all of the WebTransportSendStream objects currently associated with this group. That is, every stream whose sendGroup is set to this WebTransportSendGroup.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendGroup/getStats)
 */
suspend inline fun WebTransportSendGroup.getStats(): WebTransportSendStreamStats {
    return getStatsAsync().await()
}
