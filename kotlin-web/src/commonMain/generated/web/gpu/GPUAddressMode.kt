// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUAddressMode {
    companion object
}

inline val GPUAddressMode.Companion.clampToEdge: GPUAddressMode
    get() = unsafeCast("clamp-to-edge")

inline val GPUAddressMode.Companion.mirrorRepeat: GPUAddressMode
    get() = unsafeCast("mirror-repeat")

inline val GPUAddressMode.Companion.repeat: GPUAddressMode
    get() = unsafeCast("repeat")
