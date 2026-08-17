// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUFilterMode

inline val GPUFilterMode.Companion.linear: GPUFilterMode
    get() = unsafeCast("linear")

inline val GPUFilterMode.Companion.nearest: GPUFilterMode
    get() = unsafeCast("nearest")
