package jszip

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Compression

inline val Compression.Companion.STORE: Compression
    get() = unsafeCast("STORE")

inline val Compression.Companion.DEFLATE: Compression
    get() = unsafeCast("DEFLATE")
