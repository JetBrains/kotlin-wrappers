// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class RTCDataChannelEventTypes {

    @JsValue("datachannel")
    fun <C : EventTarget> dataChannel(): EventType<RTCDataChannelEvent, C>
}
