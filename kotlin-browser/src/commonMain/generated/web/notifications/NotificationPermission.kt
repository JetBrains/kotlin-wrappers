// Automatically generated - do not modify!

package web.notifications

import seskar.js.JsValue

sealed external interface NotificationPermission {
    companion object {
        @JsValue("default")
        val default: NotificationPermission

        @JsValue("denied")
        val denied: NotificationPermission

        @JsValue("granted")
        val granted: NotificationPermission
    }
}
