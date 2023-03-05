// Automatically generated - do not modify!

package web.wakelock

import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class WakeLockSentinel :
    EventTarget {
    var onrelease: EventHandler<Event>?
    val released: Boolean
    val type: WakeLockType
    fun release(): Promise<Void>
}
