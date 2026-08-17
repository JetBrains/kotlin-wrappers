// Automatically generated - do not modify!

package web.images

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ImageDataPixelFormat

inline val ImageDataPixelFormat.Companion.rgbaFloat16: ImageDataPixelFormat
    get() = unsafeCast("rgba-float16")

inline val ImageDataPixelFormat.Companion.rgbaUnorm8: ImageDataPixelFormat
    get() = unsafeCast("rgba-unorm8")
