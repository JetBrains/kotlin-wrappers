// Automatically generated - do not modify!

package web.screen

import kotlinx.js.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

sealed external class ScreenOrientation :
    EventTarget {
    val angle: Double
    var onchange: EventHandler<Event>?
    val type: OrientationType
    fun lock(orientation: OrientationLockType): Promise<Void>
    fun unlock()
}
