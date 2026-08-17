// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XREnvironmentBlendMode

inline val XREnvironmentBlendMode.Companion.opaque: XREnvironmentBlendMode
    get() = unsafeCast("opaque")

inline val XREnvironmentBlendMode.Companion.additive: XREnvironmentBlendMode
    get() = unsafeCast("additive")

inline val XREnvironmentBlendMode.Companion.alphaBlend: XREnvironmentBlendMode
    get() = unsafeCast("alpha-blend")
