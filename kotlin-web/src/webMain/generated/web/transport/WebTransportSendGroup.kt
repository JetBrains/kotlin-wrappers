// Automatically generated - do not modify!

package web.transport

import js.promise.Promise
import js.promise.await

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendGroup)
 */
open external class WebTransportSendGroup
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendGroup/getStats)
     */
    @JsName("getStats")
    fun getStatsAsync(): Promise<WebTransportSendStreamStats>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransportSendGroup/getStats)
 */
suspend inline fun WebTransportSendGroup.getStats(): WebTransportSendStreamStats {
    return getStatsAsync().await()
}
