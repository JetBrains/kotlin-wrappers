// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface LatencyMode

inline val LatencyMode.Companion.quality: LatencyMode
    get() = unsafeCast("quality")

inline val LatencyMode.Companion.realtime: LatencyMode
    get() = unsafeCast("realtime")
