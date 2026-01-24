// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XREye {
    companion object
}

inline val XREye.Companion.none: XREye
    get() = unsafeCast("none")

inline val XREye.Companion.left: XREye
    get() = unsafeCast("left")

inline val XREye.Companion.right: XREye
    get() = unsafeCast("right")
