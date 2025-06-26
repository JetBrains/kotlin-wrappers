// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.images

import js.reflect.unsafeCast

sealed external interface PredefinedColorSpace {
    companion object
}

inline val PredefinedColorSpace.Companion.displayP3: PredefinedColorSpace
    get() = unsafeCast("display-p3")

inline val PredefinedColorSpace.Companion.srgb: PredefinedColorSpace
    get() = unsafeCast("srgb")
