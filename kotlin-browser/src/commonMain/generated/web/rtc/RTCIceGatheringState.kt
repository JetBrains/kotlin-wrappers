// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue

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
