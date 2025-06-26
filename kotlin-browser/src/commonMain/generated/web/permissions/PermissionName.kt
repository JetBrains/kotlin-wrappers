// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

import js.reflect.unsafeCast

sealed external interface PermissionName {
    companion object
}

inline val PermissionName.Companion.camera: PermissionName
    get() = unsafeCast("camera")

inline val PermissionName.Companion.geolocation: PermissionName
    get() = unsafeCast("geolocation")

inline val PermissionName.Companion.microphone: PermissionName
    get() = unsafeCast("microphone")

inline val PermissionName.Companion.midi: PermissionName
    get() = unsafeCast("midi")

inline val PermissionName.Companion.notifications: PermissionName
    get() = unsafeCast("notifications")

inline val PermissionName.Companion.persistentStorage: PermissionName
    get() = unsafeCast("persistentStorage")

inline val PermissionName.Companion.push: PermissionName
    get() = unsafeCast("push")

inline val PermissionName.Companion.screenWakeLock: PermissionName
    get() = unsafeCast("screenWakeLock")

inline val PermissionName.Companion.storageAccess: PermissionName
    get() = unsafeCast("storageAccess")
