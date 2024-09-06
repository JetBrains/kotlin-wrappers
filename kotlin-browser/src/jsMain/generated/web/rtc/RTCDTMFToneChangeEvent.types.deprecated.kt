// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCDTMFToneChangeEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("RTCDTMFToneChangeEvent.TONE_CHANGE"),
    )
    @JsValue("tonechange")
    fun toneChange(): EventType<RTCDTMFToneChangeEvent>
}
