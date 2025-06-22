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
external class PermissionStatus
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
     * The **`state`** read-only property of the This property returns one of `'granted'`, `'denied'`, or `'prompt'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state)
     */
    val state: PermissionState
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event)
 */
inline val PermissionStatus.changeEvent: EventInstance<Event, PermissionStatus, PermissionStatus>
    get() = EventInstance(this, "change")
