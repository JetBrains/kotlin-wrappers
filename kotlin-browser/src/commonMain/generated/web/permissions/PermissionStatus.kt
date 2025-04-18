// Automatically generated - do not modify!

package web.permissions

import web.events.*

/**
 * The **`PermissionStatus`** interface of the Permissions API provides the state of an object and an event handler for monitoring changes to said state.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus)
 */
external class PermissionStatus
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event)
     */
    var onchange: EventHandler<Event, PermissionStatus, PermissionStatus>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state)
     */
    val state: PermissionState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event)
     */
    @JsEvent("change")
    val changeEvent: EventInstance<Event, PermissionStatus /* this */, PermissionStatus /* this */>
}
