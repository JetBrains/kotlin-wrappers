// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRReferenceSpaceType {
    companion object
}

inline val XRReferenceSpaceType.Companion.viewer: XRReferenceSpaceType
    get() = unsafeCast("viewer")

inline val XRReferenceSpaceType.Companion.local: XRReferenceSpaceType
    get() = unsafeCast("local")

inline val XRReferenceSpaceType.Companion.localFloor: XRReferenceSpaceType
    get() = unsafeCast("local-floor")

inline val XRReferenceSpaceType.Companion.boundedFloor: XRReferenceSpaceType
    get() = unsafeCast("bounded-floor")

inline val XRReferenceSpaceType.Companion.unbounded: XRReferenceSpaceType
    get() = unsafeCast("unbounded")
