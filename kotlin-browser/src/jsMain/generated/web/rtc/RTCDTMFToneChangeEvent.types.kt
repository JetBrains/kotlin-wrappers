// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class RTCDTMFToneChangeEventTypes {

    @JsValue("tonechange")
    fun <C : EventTarget> toneChange(): EventType<RTCDTMFToneChangeEvent, C>
}
