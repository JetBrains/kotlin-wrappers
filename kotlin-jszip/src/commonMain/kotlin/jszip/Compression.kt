@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package jszip

import js.reflect.unsafeCast

sealed external interface Compression {
    companion object
}

inline val Compression.Companion.STORE: Compression
    get() = unsafeCast("STORE")

inline val Compression.Companion.DEFLATE: Compression
    get() = unsafeCast("DEFLATE")
