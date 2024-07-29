// Automatically generated - do not modify!

package web.permissions

import seskar.js.JsValue

sealed external interface PermissionName {
    companion object {
        @JsValue("geolocation")
        val geolocation: PermissionName

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
