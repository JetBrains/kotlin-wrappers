// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

import seskar.js.JsValue

sealed external interface PermissionName {
    companion object {
        @JsValue("camera")
        val camera: PermissionName

        @JsValue("geolocation")
        val geolocation: PermissionName

        @JsValue("microphone")
        val microphone: PermissionName

        @JsValue("midi")
        val midi: PermissionName

        @JsValue("notifications")
        val notifications: PermissionName

        @JsValue("persistent-storage")
        val persistentStorage: PermissionName

        @JsValue("push")
        val push: PermissionName

        @JsValue("screen-wake-lock")
        val screenWakeLock: PermissionName

        @JsValue("storage-access")
        val storageAccess: PermissionName
    }
}
