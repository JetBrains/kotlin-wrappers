// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface EncodedAudioChunkType {
    companion object
}

inline val EncodedAudioChunkType.Companion.delta: EncodedAudioChunkType
    get() = unsafeCast("delta")

inline val EncodedAudioChunkType.Companion.key: EncodedAudioChunkType
    get() = unsafeCast("key")
