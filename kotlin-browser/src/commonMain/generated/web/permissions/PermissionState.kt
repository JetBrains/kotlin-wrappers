// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.permissions

import js.reflect.unsafeCast

sealed external interface PermissionState {
    companion object
}

inline val PermissionState.Companion.denied: PermissionState
    get() = unsafeCast("denied")

inline val PermissionState.Companion.granted: PermissionState
    get() = unsafeCast("granted")

inline val PermissionState.Companion.prompt: PermissionState
    get() = unsafeCast("prompt")
