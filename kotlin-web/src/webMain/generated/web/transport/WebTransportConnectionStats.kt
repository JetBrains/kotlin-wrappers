// Automatically generated - do not modify!

package web.transport

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface WebTransportConnectionStats {
    var bytesReceived: UInt53?
    var datagrams: WebTransportDatagramStats
    var minRtt: DOMHighResTimeStamp?
    var packetsLost: UInt53?
    var packetsReceived: UInt53?
    var packetsSent: UInt53?
    var rttVariation: DOMHighResTimeStamp?
    var smoothedRtt: DOMHighResTimeStamp?
}
