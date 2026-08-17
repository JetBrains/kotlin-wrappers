// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRDOMOverlayType

inline val XRDOMOverlayType.Companion.screen: XRDOMOverlayType
    get() = unsafeCast("screen")

inline val XRDOMOverlayType.Companion.floating: XRDOMOverlayType
    get() = unsafeCast("floating")

inline val XRDOMOverlayType.Companion.headLocked: XRDOMOverlayType
    get() = unsafeCast("head-locked")
