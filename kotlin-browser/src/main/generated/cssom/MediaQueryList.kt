// Automatically generated - do not modify!

package cssom

import web.events.EventHandler
import web.events.EventTarget

sealed external class MediaQueryList :
    EventTarget {
    val matches: Boolean
    val media: String
    var onchange: EventHandler<MediaQueryListEvent>?
}
