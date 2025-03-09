// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue

sealed external interface RTCQualityLimitationReason {
    companion object {
        @JsValue("bandwidth")
        val bandwidth: RTCQualityLimitationReason

        @JsValue("cpu")
        val cpu: RTCQualityLimitationReason

        @JsValue("none")
        val none: RTCQualityLimitationReason

        @JsValue("other")
        val other: RTCQualityLimitationReason
    }
}
