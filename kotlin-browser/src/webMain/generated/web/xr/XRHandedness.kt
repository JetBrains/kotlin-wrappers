// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRHandedness {
    companion object
}

inline val XRHandedness.Companion.none: XRHandedness
    get() = unsafeCast("none")

inline val XRHandedness.Companion.left: XRHandedness
    get() = unsafeCast("left")

inline val XRHandedness.Companion.right: XRHandedness
    get() = unsafeCast("right")
