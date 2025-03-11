// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

sealed external interface RTCEncodedVideoFrameType {
    companion object {
        @JsValue("delta")
        val delta: RTCEncodedVideoFrameType

        @JsValue("empty")
        val empty: RTCEncodedVideoFrameType

        @JsValue("key")
        val key: RTCEncodedVideoFrameType
    }
}
