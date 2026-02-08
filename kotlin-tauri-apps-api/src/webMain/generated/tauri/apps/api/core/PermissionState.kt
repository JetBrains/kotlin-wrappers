// Automatically generated - do not modify!

package tauri.apps.api.core

sealed external interface PermissionState {
    companion object
}

inline val PermissionState.Companion.granted: PermissionState
    get() = js.reflect.unsafeCast("granted")

inline val PermissionState.Companion.denied: PermissionState
    get() = js.reflect.unsafeCast("denied")

inline val PermissionState.Companion.prompt: PermissionState
    get() = js.reflect.unsafeCast("prompt")

inline val PermissionState.Companion.promptWithRationale: PermissionState
    get() = js.reflect.unsafeCast("prompt-with-rationale")
