// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface EncodedVideoChunkType {
    companion object {
        @JsValue("delta")
        val delta: EncodedVideoChunkType

        @JsValue("key")
        val key: EncodedVideoChunkType
    }
}
