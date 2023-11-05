// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RTCIceGatheringState {
    companion object {
        @JsValue("complete")
        val complete: RTCIceGatheringState

        @JsValue("gathering")
        val gathering: RTCIceGatheringState

        @JsValue("new")
        val new: RTCIceGatheringState
    }
}
