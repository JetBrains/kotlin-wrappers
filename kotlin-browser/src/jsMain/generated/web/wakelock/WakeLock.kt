// Automatically generated - do not modify!

package web.wakelock

import js.promise.Promise
import seskar.js.JsAsync

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock)
 */
sealed external class WakeLock {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request)
     */
    @JsAsync
    suspend fun request(type: WakeLockType = definedExternally): WakeLockSentinel

    @JsName("request")
    fun requestAsync(type: WakeLockType = definedExternally): Promise<WakeLockSentinel>
}
