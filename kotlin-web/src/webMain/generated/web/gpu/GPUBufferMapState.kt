// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapState)
 */
@JsUnion
sealed /* union */
external interface GPUBufferMapState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapState#mapped)
 */
inline val GPUBufferMapState.Companion.mapped: GPUBufferMapState
    get() = unsafeCast("mapped")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapState#pending)
 */
inline val GPUBufferMapState.Companion.pending: GPUBufferMapState
    get() = unsafeCast("pending")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUBuffer/mapState#unmapped)
 */
inline val GPUBufferMapState.Companion.unmapped: GPUBufferMapState
    get() = unsafeCast("unmapped")
