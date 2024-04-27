// Automatically generated - do not modify!

package web.rtc

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
