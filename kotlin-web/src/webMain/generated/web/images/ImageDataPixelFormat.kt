// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.images

import js.reflect.unsafeCast

sealed external interface ImageDataPixelFormat {
    companion object
}

inline val ImageDataPixelFormat.Companion.rgbaFloat16: ImageDataPixelFormat
    get() = unsafeCast("rgba-float16")

inline val ImageDataPixelFormat.Companion.rgbaUnorm8: ImageDataPixelFormat
    get() = unsafeCast("rgba-unorm8")
