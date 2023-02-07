// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class PermissionStatus :
    EventTarget {
    val name: String
    var onchange: EventHandler<Event>?
    val state: PermissionState
}
