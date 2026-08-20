// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type)
 */
@JsUnion
sealed /* union */
external interface EncodedVideoChunkType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type#delta)
 */
inline val EncodedVideoChunkType.Companion.delta: EncodedVideoChunkType
    get() = unsafeCast("delta")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type#key)
 */
inline val EncodedVideoChunkType.Companion.key: EncodedVideoChunkType
    get() = unsafeCast("key")
