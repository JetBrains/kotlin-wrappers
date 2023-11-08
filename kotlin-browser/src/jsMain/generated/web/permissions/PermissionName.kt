// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PermissionName {
    companion object {
        @JsValue("geolocation")
        val geolocation: PermissionName

        @JsValue("notifications")
        val notifications: PermissionName

        @JsValue("persistent-storage")
        val persistentStorage: PermissionName

        @JsValue("push")
        val push: PermissionName

        @JsValue("screen-wake-lock")
        val screenWakeLock: PermissionName

        @JsValue("xr-spatial-tracking")
        val xrSpatialTracking: PermissionName
    }
}
