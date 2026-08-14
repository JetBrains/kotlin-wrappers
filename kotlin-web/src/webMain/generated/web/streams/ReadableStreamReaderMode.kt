// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.streams

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ReadableStreamReaderMode {
    companion object
}

inline val ReadableStreamReaderMode.Companion.byob: ReadableStreamReaderMode
    get() = unsafeCast("byob")
