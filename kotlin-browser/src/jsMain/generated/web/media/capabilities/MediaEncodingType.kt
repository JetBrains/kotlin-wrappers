// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.capabilities

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MediaEncodingType {
    companion object {
        @JsValue("record")
        val record: MediaEncodingType

        @JsValue("webrtc")
        val webrtc: MediaEncodingType
    }
}
