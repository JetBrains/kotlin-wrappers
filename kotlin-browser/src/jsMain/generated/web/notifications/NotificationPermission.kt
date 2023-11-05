// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.notifications

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
