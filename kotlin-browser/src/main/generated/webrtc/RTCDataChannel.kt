// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.messaging.MessageEvent
import websockets.BinaryType

external class RTCDataChannel : web.events.EventTarget {
    var binaryType: BinaryType
    val bufferedAmount: Number
    var bufferedAmountLowThreshold: Number
    val id: Number?
    val label: String
    val maxPacketLifeTime: Number?
    val maxRetransmits: Number?
    val negotiated: Boolean
    var onbufferedamountlow: ((event: Event) -> Unit)?
    var onclose: ((event: Event) -> Unit)?
    var onclosing: ((event: Event) -> Unit)?
    var onerror: ((event: Event) -> Unit)?
    var onmessage: ((event: MessageEvent<*>) -> Unit)?
    var onopen: ((event: Event) -> Unit)?
    val ordered: Boolean
    val protocol: String
    val readyState: RTCDataChannelState
    fun close()
    fun send(data: String)
    fun send(data: web.buffer.Blob)
    fun send(data: kotlinx.js.ArrayBuffer)
    fun send(data: kotlinx.js.ArrayBufferView)
}
