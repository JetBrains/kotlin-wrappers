// Automatically generated - do not modify!

package web.wakelock

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*

/**
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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release_event)
     */
    @JsEvent("release")
    val releaseEvent: EventInstance<Event, WakeLockSentinel /* this */, WakeLockSentinel /* this */>
}
