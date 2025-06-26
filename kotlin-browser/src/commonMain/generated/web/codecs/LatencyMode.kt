// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface LatencyMode {
    companion object
}

inline val LatencyMode.Companion.quality: LatencyMode
    get() = unsafeCast("quality")

inline val LatencyMode.Companion.realtime: LatencyMode
    get() = unsafeCast("realtime")
