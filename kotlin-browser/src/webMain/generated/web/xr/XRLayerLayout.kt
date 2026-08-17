// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRLayerLayout

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
