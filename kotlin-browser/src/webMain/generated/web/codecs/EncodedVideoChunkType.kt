// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface EncodedVideoChunkType

inline val EncodedVideoChunkType.Companion.delta: EncodedVideoChunkType
    get() = unsafeCast("delta")

inline val EncodedVideoChunkType.Companion.key: EncodedVideoChunkType
    get() = unsafeCast("key")
