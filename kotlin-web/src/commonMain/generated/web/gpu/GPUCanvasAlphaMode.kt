// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUCanvasAlphaMode {
    companion object
}

inline val GPUCanvasAlphaMode.Companion.opaque: GPUCanvasAlphaMode
    get() = unsafeCast("opaque")

inline val GPUCanvasAlphaMode.Companion.premultiplied: GPUCanvasAlphaMode
    get() = unsafeCast("premultiplied")
