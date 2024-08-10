// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class RTCPeerConnectionIceErrorEventTypes {

    @JsValue("icecandidateerror")
    fun <C : EventTarget> iceCandidateError(): EventType<RTCPeerConnectionIceErrorEvent, C>
}
