// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRReferenceSpaceType

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
