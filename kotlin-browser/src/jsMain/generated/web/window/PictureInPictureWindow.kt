// Automatically generated - do not modify!

package web.window

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class PictureInPictureWindow :
    EventTarget {
    val height: Double
    var onresize: EventHandler<Event>?
    val width: Double
}
