// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet/type)
 */
@JsUnion
sealed /* union */
external interface GPUQueryType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet/type#occlusion)
 */
inline val GPUQueryType.Companion.occlusion: GPUQueryType
    get() = unsafeCast("occlusion")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUQuerySet/type#timestamp)
 */
inline val GPUQueryType.Companion.timestamp: GPUQueryType
    get() = unsafeCast("timestamp")
