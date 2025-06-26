// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface EncodedVideoChunkType {
    companion object
}

inline val EncodedVideoChunkType.Companion.delta: EncodedVideoChunkType
    get() = unsafeCast("delta")

inline val EncodedVideoChunkType.Companion.key: EncodedVideoChunkType
    get() = unsafeCast("key")
