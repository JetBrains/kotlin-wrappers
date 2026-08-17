// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRTargetRayMode

inline val XRTargetRayMode.Companion.gaze: XRTargetRayMode
    get() = unsafeCast("gaze")

inline val XRTargetRayMode.Companion.trackedPointer: XRTargetRayMode
    get() = unsafeCast("tracked-pointer")

inline val XRTargetRayMode.Companion.screen: XRTargetRayMode
    get() = unsafeCast("screen")

inline val XRTargetRayMode.Companion.transientPointer: XRTargetRayMode
    get() = unsafeCast("transient-pointer")
