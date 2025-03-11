// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface EncodedAudioChunkType {
    companion object {
        @JsValue("delta")
        val delta: EncodedAudioChunkType

        @JsValue("key")
        val key: EncodedAudioChunkType
    }
}
