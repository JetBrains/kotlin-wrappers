// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCIceGathererState {
    companion object {
        @JsValue("complete")
        val complete: RTCIceGathererState

        @JsValue("gathering")
        val gathering: RTCIceGathererState

        @JsValue("new")
        val new: RTCIceGathererState
    }
}
