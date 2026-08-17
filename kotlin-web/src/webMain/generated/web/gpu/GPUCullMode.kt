// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUCullMode

inline val GPUCullMode.Companion.back: GPUCullMode
    get() = unsafeCast("back")

inline val GPUCullMode.Companion.front: GPUCullMode
    get() = unsafeCast("front")

inline val GPUCullMode.Companion.none: GPUCullMode
    get() = unsafeCast("none")
