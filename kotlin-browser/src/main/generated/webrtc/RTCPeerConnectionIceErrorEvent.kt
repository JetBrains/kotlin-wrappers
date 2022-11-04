// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit

external interface RTCPeerConnectionIceErrorEventInit : EventInit {
    var address: String?
    var errorCode: Short
    var errorText: String?
    var port: Short?
    var url: String?
}

open external class RTCPeerConnectionIceErrorEvent(
    type: String,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    val address: String?
    val errorCode: Short
    val errorText: String
    val port: Short?
    val url: String

    companion object
}
