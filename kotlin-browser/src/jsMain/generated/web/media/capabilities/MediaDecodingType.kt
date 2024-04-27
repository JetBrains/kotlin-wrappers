// Automatically generated - do not modify!

package web.media.capabilities

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MediaDecodingType {
    companion object {
        @JsValue("file")
        val file: MediaDecodingType

        @JsValue("media-source")
        val mediaSource: MediaDecodingType

        @JsValue("webrtc")
        val webrtc: MediaDecodingType
    }
}
