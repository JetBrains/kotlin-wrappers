// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRDOMOverlayType {
    companion object
}

inline val XRDOMOverlayType.Companion.screen: XRDOMOverlayType
    get() = unsafeCast("screen")

inline val XRDOMOverlayType.Companion.floating: XRDOMOverlayType
    get() = unsafeCast("floating")

inline val XRDOMOverlayType.Companion.headLocked: XRDOMOverlayType
    get() = unsafeCast("head-locked")
