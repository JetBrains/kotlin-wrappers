// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
