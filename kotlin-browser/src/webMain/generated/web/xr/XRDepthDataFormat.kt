// Automatically generated - do not modify!

package web.xr

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface XRDepthDataFormat

inline val XRDepthDataFormat.Companion.luminanceAlpha: XRDepthDataFormat
    get() = unsafeCast("luminance-alpha")

inline val XRDepthDataFormat.Companion.float32: XRDepthDataFormat
    get() = unsafeCast("float32")

inline val XRDepthDataFormat.Companion.unsignedShort: XRDepthDataFormat
    get() = unsafeCast("unsigned-short")
