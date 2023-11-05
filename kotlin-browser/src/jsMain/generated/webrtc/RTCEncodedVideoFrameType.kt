// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
