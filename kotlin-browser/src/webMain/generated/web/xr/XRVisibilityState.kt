// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRVisibilityState

inline val XRVisibilityState.Companion.visible: XRVisibilityState
    get() = unsafeCast("visible")

inline val XRVisibilityState.Companion.visibleBlurred: XRVisibilityState
    get() = unsafeCast("visible-blurred")

inline val XRVisibilityState.Companion.hidden: XRVisibilityState
    get() = unsafeCast("hidden")
