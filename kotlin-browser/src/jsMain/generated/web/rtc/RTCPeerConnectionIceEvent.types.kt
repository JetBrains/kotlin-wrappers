// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class RTCPeerConnectionIceEventTypes {

    @JsValue("icecandidate")
    fun <C : EventTarget> iceCandidate(): EventType<RTCPeerConnectionIceEvent, C>
}
