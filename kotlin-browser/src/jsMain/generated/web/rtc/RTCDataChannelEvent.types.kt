// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class RTCDataChannelEventTypes {

    @JsValue("datachannel")
    fun <C : EventTarget> dataChannel(): EventType<RTCDataChannelEvent<C>>
}
