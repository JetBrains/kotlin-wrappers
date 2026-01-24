// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.xr

import js.reflect.unsafeCast

sealed external interface XRDepthDataFormat {
    companion object
}

inline val XRDepthDataFormat.Companion.luminanceAlpha: XRDepthDataFormat
    get() = unsafeCast("luminance-alpha")

inline val XRDepthDataFormat.Companion.float32: XRDepthDataFormat
    get() = unsafeCast("float32")

inline val XRDepthDataFormat.Companion.unsignedShort: XRDepthDataFormat
    get() = unsafeCast("unsigned-short")
