// Automatically generated - do not modify!

package web.wakelock

import kotlin.js.Promise

sealed external class WakeLock {
    fun request(type: WakeLockType = definedExternally): Promise<WakeLockSentinel>
}
