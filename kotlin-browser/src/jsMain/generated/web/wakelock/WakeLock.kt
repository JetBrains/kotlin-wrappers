// Automatically generated - do not modify!

package web.wakelock

import kotlin.js.Promise

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock)
 */
sealed external class WakeLock {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLock/request) */
    fun request(type: WakeLockType = definedExternally): Promise<WakeLockSentinel>
}
