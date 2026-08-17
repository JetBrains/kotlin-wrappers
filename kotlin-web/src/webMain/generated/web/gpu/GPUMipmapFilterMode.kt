// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUMipmapFilterMode

inline val GPUMipmapFilterMode.Companion.linear: GPUMipmapFilterMode
    get() = unsafeCast("linear")

inline val GPUMipmapFilterMode.Companion.nearest: GPUMipmapFilterMode
    get() = unsafeCast("nearest")
