// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUQueryType

inline val GPUQueryType.Companion.occlusion: GPUQueryType
    get() = unsafeCast("occlusion")

inline val GPUQueryType.Companion.timestamp: GPUQueryType
    get() = unsafeCast("timestamp")
