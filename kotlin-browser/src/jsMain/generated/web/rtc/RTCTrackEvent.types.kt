// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class RTCTrackEventTypes {

    @JsValue("track")
    fun <C : EventTarget> track(): EventType<RTCTrackEvent, C>
}
