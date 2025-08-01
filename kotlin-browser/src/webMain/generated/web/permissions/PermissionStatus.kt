// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * The **`PermissionStatus`** interface of the Permissions API provides the state of an object and an event handler for monitoring changes to said state.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus)
 */
open external class PermissionStatus
private constructor() :
    EventTarget {
    /**
     * The **`name`** read-only property of the PermissionStatus interface returns the name of a requested permission.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event)
     */
    var onchange: EventHandler<Event, PermissionStatus, PermissionStatus>?

    /**
     * The **`state`** read-only property of the PermissionStatus interface returns the state of a requested permission.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state)
     */
    val state: PermissionState
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event)
 */
inline val <C : PermissionStatus> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "change")
