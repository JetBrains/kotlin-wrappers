// Automatically generated - do not modify!

package js.typedarrays

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface LastChunkHandling

inline val LastChunkHandling.Companion.loose: LastChunkHandling
    get() = unsafeCast("loose")

inline val LastChunkHandling.Companion.strict: LastChunkHandling
    get() = unsafeCast("strict")

inline val LastChunkHandling.Companion.stopBeforePartial: LastChunkHandling
    get() = unsafeCast("stop-before-partial")
