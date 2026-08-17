// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRHitTestTrackableType

inline val XRHitTestTrackableType.Companion.point: XRHitTestTrackableType
    get() = unsafeCast("point")

inline val XRHitTestTrackableType.Companion.plane: XRHitTestTrackableType
    get() = unsafeCast("plane")

inline val XRHitTestTrackableType.Companion.mesh: XRHitTestTrackableType
    get() = unsafeCast("mesh")
