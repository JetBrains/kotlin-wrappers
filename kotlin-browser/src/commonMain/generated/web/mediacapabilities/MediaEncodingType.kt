// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediacapabilities

import seskar.js.JsValue

sealed external interface MediaEncodingType {
    companion object {
        @JsValue("record")
        val record: MediaEncodingType

        @JsValue("webrtc")
        val webrtc: MediaEncodingType
    }
}
