// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type)
 */
@JsUnion
sealed /* union */
external interface EncodedAudioChunkType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type#delta)
 */
inline val EncodedAudioChunkType.Companion.delta: EncodedAudioChunkType
    get() = unsafeCast("delta")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type#key)
 */
inline val EncodedAudioChunkType.Companion.key: EncodedAudioChunkType
    get() = unsafeCast("key")
