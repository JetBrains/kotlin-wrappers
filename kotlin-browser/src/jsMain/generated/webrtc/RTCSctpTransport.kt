// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class RTCSctpTransport :
    EventTarget {
    val maxChannels: Number?
    val maxMessageSize: Number
    var onstatechange: EventHandler<Event>?
    val state: RTCSctpTransportState
    val transport: RTCDtlsTransport
}
