// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.compression

import js.reflect.unsafeCast

sealed external interface CompressionFormat {
    companion object
}

inline val CompressionFormat.Companion.deflate: CompressionFormat
    get() = unsafeCast("deflate")

inline val CompressionFormat.Companion.deflateRaw: CompressionFormat
    get() = unsafeCast("deflate-raw")

inline val CompressionFormat.Companion.gzip: CompressionFormat
    get() = unsafeCast("gzip")
