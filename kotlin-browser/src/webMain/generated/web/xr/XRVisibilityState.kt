// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRVisibilityState {
    companion object
}

inline val XRVisibilityState.Companion.visible: XRVisibilityState
    get() = unsafeCast("visible")

inline val XRVisibilityState.Companion.visibleBlurred: XRVisibilityState
    get() = unsafeCast("visible-blurred")

inline val XRVisibilityState.Companion.hidden: XRVisibilityState
    get() = unsafeCast("hidden")
