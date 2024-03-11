// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class RTCDTMFToneChangeEventTypes {

    @JsValue("tonechange")
    fun <C : EventTarget> toneChange(): EventType<RTCDTMFToneChangeEvent<C>>
}
