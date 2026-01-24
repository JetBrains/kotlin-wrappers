// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRInteractionMode {
    companion object
}

inline val XRInteractionMode.Companion.screenSpace: XRInteractionMode
    get() = unsafeCast("screen-space")

inline val XRInteractionMode.Companion.worldSpace: XRInteractionMode
    get() = unsafeCast("world-space")
