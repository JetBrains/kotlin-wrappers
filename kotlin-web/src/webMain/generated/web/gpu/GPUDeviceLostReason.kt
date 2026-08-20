// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDeviceLostInfo/reason)
 */
@JsUnion
sealed /* union */
external interface GPUDeviceLostReason

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDeviceLostInfo/reason#destroyed)
 */
inline val GPUDeviceLostReason.Companion.destroyed: GPUDeviceLostReason
    get() = unsafeCast("destroyed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDeviceLostInfo/reason#unknown)
 */
inline val GPUDeviceLostReason.Companion.unknown: GPUDeviceLostReason
    get() = unsafeCast("unknown")
