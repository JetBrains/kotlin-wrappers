// Automatically generated - do not modify!

package web.permissions

import web.events.EventTarget

sealed external class PermissionStatus :
    EventTarget {
    // onchange: ((this: PermissionStatus, ev: Event) => any) | null
    val state: PermissionState
}
