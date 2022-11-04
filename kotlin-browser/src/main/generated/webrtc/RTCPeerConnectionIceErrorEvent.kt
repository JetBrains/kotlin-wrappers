// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit

external interface RTCPeerConnectionIceErrorEventInit : EventInit {
    var address: String?
    var errorCode: Int
    var errorText: String?
    var port: Int?
    var url: String?
}

open external class RTCPeerConnectionIceErrorEvent(
    type: String,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    val address: String?
    val errorCode: Int
    val errorText: String
    val port: Int?
    val url: String

    companion object
}
