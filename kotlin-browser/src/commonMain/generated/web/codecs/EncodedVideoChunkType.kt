// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface EncodedVideoChunkType {
    companion object {
        @JsValue("delta")
        val delta: EncodedVideoChunkType

        @JsValue("key")
        val key: EncodedVideoChunkType
    }
}
