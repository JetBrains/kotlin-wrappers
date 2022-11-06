// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventTarget

sealed external class PermissionStatus :
    EventTarget {
    var onchange: ((event: Event) -> Unit)?
    val state: PermissionState
}
