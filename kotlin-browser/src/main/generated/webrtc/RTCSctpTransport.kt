// Automatically generated - do not modify!

package webrtc

import web.events.Event

external class RTCSctpTransport : web.events.EventTarget {
    val maxChannels: Number?
    val maxMessageSize: Number
    var onstatechange: ((event: Event) -> Unit)?
    val state: RTCSctpTransportState
    val transport: RTCDtlsTransport
}
