// Automatically generated - do not modify!

package web.wakelock

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import kotlin.js.JsName

/**
 * The **`WakeLockSentinel`** interface of the Screen Wake Lock API can be used to monitor the status of the platform screen wake lock, and manually release the lock when needed.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel)
 */
external class WakeLockSentinel
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release_event)
     */
    var onrelease: EventHandler<Event, WakeLockSentinel, WakeLockSentinel>?

    /**
     * The **`released`** read-only property of the WakeLockSentinel interface returns a boolean that indicates whether a WakeLockSentinel has been released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/released)
     */
    val released: Boolean

    /**
     * The **`type`** read-only property of the WakeLockSentinel interface returns a string representation of the currently acquired WakeLockSentinel type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/type)
     */
    val type: WakeLockType

    /**
     * The **`release()`** method of the WakeLockSentinel interface releases the WakeLockSentinel, returning a Promise that is resolved once the sentinel has been successfully released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun release()

    @JsName("release")
    fun releaseAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release_event)
     */
    @JsEvent("release")
    val releaseEvent: EventInstance<Event, WakeLockSentinel /* this */, WakeLockSentinel /* this */>
}
