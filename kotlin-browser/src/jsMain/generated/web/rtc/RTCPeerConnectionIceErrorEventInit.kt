// Automatically generated - do not modify!

package web.rtc

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface RTCPeerConnectionIceErrorEventInit :
    EventInit {
    val address: String?
    val errorCode: UShort
    val errorText: String?
    val port: UShort?
    val url: String?
}
