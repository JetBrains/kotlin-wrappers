// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCPriorityType {
    companion object {
        @JsValue("high")
        val high: RTCPriorityType

        @JsValue("low")
        val low: RTCPriorityType

        @JsValue("medium")
        val medium: RTCPriorityType

        @JsValue("very-low")
        val veryLow: RTCPriorityType
    }
}
