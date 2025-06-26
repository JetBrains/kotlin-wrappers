// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.typedarrays

import js.reflect.unsafeCast

sealed external interface LastChunkHandling {
    companion object
}

inline val LastChunkHandling.Companion.loose: LastChunkHandling
    get() = unsafeCast("loose")

inline val LastChunkHandling.Companion.strict: LastChunkHandling
    get() = unsafeCast("strict")

inline val LastChunkHandling.Companion.stopBeforePartial: LastChunkHandling
    get() = unsafeCast("stopBeforePartial")
