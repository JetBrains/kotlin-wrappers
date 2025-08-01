// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.notifications

import js.reflect.unsafeCast

sealed external interface NotificationPermission {
    companion object
}

inline val NotificationPermission.Companion.default: NotificationPermission
    get() = unsafeCast("default")

inline val NotificationPermission.Companion.denied: NotificationPermission
    get() = unsafeCast("denied")

inline val NotificationPermission.Companion.granted: NotificationPermission
    get() = unsafeCast("granted")
