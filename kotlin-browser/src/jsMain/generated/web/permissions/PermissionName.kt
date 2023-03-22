// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

// language=JavaScript
@JsName("""(/*union*/{geolocation: 'geolocation', notifications: 'notifications', persistentStorage: 'persistent-storage', push: 'push', screenWakeLock: 'screen-wake-lock', xrSpatialTracking: 'xr-spatial-tracking'}/*union*/)""")
sealed external interface PermissionName {
    companion object {
        val geolocation: PermissionName
        val notifications: PermissionName
        val persistentStorage: PermissionName
        val push: PermissionName
        val screenWakeLock: PermissionName
        val xrSpatialTracking: PermissionName
    }
}
