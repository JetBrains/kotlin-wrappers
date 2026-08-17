// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRInteractionMode

inline val XRInteractionMode.Companion.screenSpace: XRInteractionMode
    get() = unsafeCast("screen-space")

inline val XRInteractionMode.Companion.worldSpace: XRInteractionMode
    get() = unsafeCast("world-space")
