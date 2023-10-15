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

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent) */
open external class RTCPeerConnectionIceErrorEvent(
    override val type: EventType<RTCPeerConnectionIceErrorEvent>,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/address) */
    val address: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/errorCode) */
    val errorCode: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/errorText) */
    val errorText: String
    val port: Int?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/url) */
    val url: String

    companion object
}
