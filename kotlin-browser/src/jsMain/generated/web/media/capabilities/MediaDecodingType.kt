// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

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
