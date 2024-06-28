// Automatically generated - do not modify!

package web.wakelock

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel)
 */
sealed external class WakeLockSentinel :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release_event)
     */
    var onrelease: EventHandler<Event, WakeLockSentinel, EventTarget>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/released)
     */
    val released: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/type)
     */
    val type: WakeLockType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release)
     */
    @JsAsync
    suspend fun release()

    @JsName("release")
    fun releaseAsync(): Promise<Void>
}
