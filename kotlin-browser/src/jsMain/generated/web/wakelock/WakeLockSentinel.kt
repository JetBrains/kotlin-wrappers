// Automatically generated - do not modify!

package web.wakelock

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class WakeLockSentinel :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release_event) */
    var onrelease: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/released) */
    val released: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/type) */
    val type: WakeLockType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release) */
    fun release(): Promise<Void>
}
