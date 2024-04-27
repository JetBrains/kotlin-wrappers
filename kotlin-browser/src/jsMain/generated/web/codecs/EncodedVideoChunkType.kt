// Automatically generated - do not modify!

package web.codecs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface EncodedVideoChunkType {
    companion object {
        @JsValue("delta")
        val delta: EncodedVideoChunkType

        @JsValue("key")
        val key: EncodedVideoChunkType
    }
}
