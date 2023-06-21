// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class PermissionStatus :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/name) */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event) */
    var onchange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state) */
    val state: PermissionState
}
