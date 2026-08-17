// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface EncodedAudioChunkType

inline val EncodedAudioChunkType.Companion.delta: EncodedAudioChunkType
    get() = unsafeCast("delta")

inline val EncodedAudioChunkType.Companion.key: EncodedAudioChunkType
    get() = unsafeCast("key")
