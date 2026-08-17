// Automatically generated - do not modify!

package web.permissions

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PermissionState

inline val PermissionState.Companion.denied: PermissionState
    get() = unsafeCast("denied")

inline val PermissionState.Companion.granted: PermissionState
    get() = unsafeCast("granted")

inline val PermissionState.Companion.prompt: PermissionState
    get() = unsafeCast("prompt")
