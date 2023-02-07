// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCPeerConnectionIceErrorEventInit : EventInit {
    var address: String?
    var errorCode: Int
    var errorText: String?
    var port: Int?
    var url: String?
}

open external class RTCPeerConnectionIceErrorEvent(
    override val type: EventType<RTCPeerConnectionIceErrorEvent>,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    val address: String?
    val errorCode: Int
    val errorText: String
    val port: Int?
    val url: String

    companion object
}
