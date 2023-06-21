// Automatically generated - do not modify!

package web.screen

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class ScreenOrientation :
    EventTarget {
    val angle: Double
    var onchange: EventHandler<Event>?
    val type: OrientationType
    fun unlock()
}
