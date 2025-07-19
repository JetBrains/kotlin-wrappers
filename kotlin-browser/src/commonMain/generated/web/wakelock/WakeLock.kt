// Automatically generated - do not modify!

package web.wakelock

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`WakeLock`** interface of the Screen Wake Lock API can be used to request a lock that prevents device screens from dimming or locking when an application needs to keep running.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock)
 */
open external class WakeLock
private constructor() {
    /**
     * The **`request()`** method of the WakeLock interface returns a Promise that fulfills with a WakeLockSentinel object if the system screen wake lock is granted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request)
     */
    @JsName("request")
    fun requestAsync(type: WakeLockType = definedExternally): Promise<WakeLockSentinel>
}

/**
 * The **`request()`** method of the WakeLock interface returns a Promise that fulfills with a WakeLockSentinel object if the system screen wake lock is granted.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request)
 */
suspend inline fun WakeLock.request(type: WakeLockType): WakeLockSentinel {
    return requestAsync(
        type = type,
    ).await()
}

/**
 * The **`request()`** method of the WakeLock interface returns a Promise that fulfills with a WakeLockSentinel object if the system screen wake lock is granted.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request)
 */
suspend inline fun WakeLock.request(): WakeLockSentinel {
    return requestAsync().await()
}
