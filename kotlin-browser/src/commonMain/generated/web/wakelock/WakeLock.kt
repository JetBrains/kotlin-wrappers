// Automatically generated - do not modify!

package web.wakelock

import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`WakeLock`** interface of the Screen Wake Lock API can be used to request a lock that prevents device screens from dimming or locking when an application needs to keep running.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock)
 */
external class WakeLock
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun request(type: WakeLockType = definedExternally): WakeLockSentinel

    @JsName("request")
    fun requestAsync(type: WakeLockType = definedExternally): Promise<WakeLockSentinel>
}
