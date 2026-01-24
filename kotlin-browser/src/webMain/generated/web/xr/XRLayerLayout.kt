// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRLayerLayout {
    companion object
}

inline val XRLayerLayout.Companion.default: XRLayerLayout
    get() = unsafeCast("default")

inline val XRLayerLayout.Companion.mono: XRLayerLayout
    get() = unsafeCast("mono")

inline val XRLayerLayout.Companion.stereo: XRLayerLayout
    get() = unsafeCast("stereo")

inline val XRLayerLayout.Companion.stereoLeftRight: XRLayerLayout
    get() = unsafeCast("stereo-left-right")

inline val XRLayerLayout.Companion.stereoTopBottom: XRLayerLayout
    get() = unsafeCast("stereo-top-bottom")
