// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUCanvasAlphaMode

inline val GPUCanvasAlphaMode.Companion.opaque: GPUCanvasAlphaMode
    get() = unsafeCast("opaque")

inline val GPUCanvasAlphaMode.Companion.premultiplied: GPUCanvasAlphaMode
    get() = unsafeCast("premultiplied")
