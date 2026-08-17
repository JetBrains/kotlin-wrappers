// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUDeviceLostReason

inline val GPUDeviceLostReason.Companion.destroyed: GPUDeviceLostReason
    get() = unsafeCast("destroyed")

inline val GPUDeviceLostReason.Companion.unknown: GPUDeviceLostReason
    get() = unsafeCast("unknown")
