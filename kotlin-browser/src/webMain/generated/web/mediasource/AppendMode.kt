// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediasource

import js.reflect.unsafeCast

sealed external interface AppendMode {
    companion object
}

inline val AppendMode.Companion.segments: AppendMode
    get() = unsafeCast("segments")

inline val AppendMode.Companion.sequence: AppendMode
    get() = unsafeCast("sequence")
