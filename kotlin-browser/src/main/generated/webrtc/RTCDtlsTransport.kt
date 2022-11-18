// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import web.events.Event

external class RTCDtlsTransport : web.events.EventTarget {
    val iceTransport: RTCIceTransport
    var onerror: ((event: Event) -> Unit)?
    var onstatechange: ((event: Event) -> Unit)?
    val state: RTCDtlsTransportState
    fun getRemoteCertificates(): ReadonlyArray<kotlinx.js.ArrayBuffer>
}
