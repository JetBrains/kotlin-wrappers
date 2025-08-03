// Automatically generated - do not modify!

package web.rtc

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/RTCPeerConnectionIceErrorEvent#options)
 */
@JsPlainObject
external interface RTCPeerConnectionIceErrorEventInit :
    EventInit {
    var address: String?
    var errorCode: Short
    var errorText: String?
    var port: Short?
    var url: String?
}
