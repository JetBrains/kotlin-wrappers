// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.capabilities

import seskar.js.JsValue

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
