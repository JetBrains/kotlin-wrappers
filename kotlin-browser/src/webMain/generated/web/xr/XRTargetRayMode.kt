// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRTargetRayMode {
    companion object
}

inline val XRTargetRayMode.Companion.gaze: XRTargetRayMode
    get() = unsafeCast("gaze")

inline val XRTargetRayMode.Companion.trackedPointer: XRTargetRayMode
    get() = unsafeCast("tracked-pointer")

inline val XRTargetRayMode.Companion.screen: XRTargetRayMode
    get() = unsafeCast("screen")

inline val XRTargetRayMode.Companion.transientPointer: XRTargetRayMode
    get() = unsafeCast("transient-pointer")
