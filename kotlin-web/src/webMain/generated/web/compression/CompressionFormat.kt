// Automatically generated - do not modify!

package web.compression

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CompressionFormat

inline val CompressionFormat.Companion.brotli: CompressionFormat
    get() = unsafeCast("brotli")

inline val CompressionFormat.Companion.deflate: CompressionFormat
    get() = unsafeCast("deflate")

inline val CompressionFormat.Companion.deflateRaw: CompressionFormat
    get() = unsafeCast("deflate-raw")

inline val CompressionFormat.Companion.gzip: CompressionFormat
    get() = unsafeCast("gzip")
