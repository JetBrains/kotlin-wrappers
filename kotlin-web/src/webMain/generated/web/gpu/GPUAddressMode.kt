// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUAddressMode

inline val GPUAddressMode.Companion.clampToEdge: GPUAddressMode
    get() = unsafeCast("clamp-to-edge")

inline val GPUAddressMode.Companion.mirrorRepeat: GPUAddressMode
    get() = unsafeCast("mirror-repeat")

inline val GPUAddressMode.Companion.repeat: GPUAddressMode
    get() = unsafeCast("repeat")
