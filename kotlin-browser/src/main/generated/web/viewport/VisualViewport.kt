// Automatically generated - do not modify!

package web.viewport

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class VisualViewport :
    EventTarget {
    val height: Double
    val offsetLeft: Int
    val offsetTop: Int
    var onresize: EventHandler<Event>?
    var onscroll: EventHandler<Event>?
    val pageLeft: Double
    val pageTop: Double
    val scale: Double
    val width: Double
}
