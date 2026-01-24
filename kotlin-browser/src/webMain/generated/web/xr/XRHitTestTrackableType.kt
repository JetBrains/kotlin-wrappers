// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRHitTestTrackableType {
    companion object
}

inline val XRHitTestTrackableType.Companion.point: XRHitTestTrackableType
    get() = unsafeCast("point")

inline val XRHitTestTrackableType.Companion.plane: XRHitTestTrackableType
    get() = unsafeCast("plane")

inline val XRHitTestTrackableType.Companion.mesh: XRHitTestTrackableType
    get() = unsafeCast("mesh")
