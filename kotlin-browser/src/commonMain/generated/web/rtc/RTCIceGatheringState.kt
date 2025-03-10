// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
