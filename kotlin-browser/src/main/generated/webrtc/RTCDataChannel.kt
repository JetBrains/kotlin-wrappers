// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ArrayBuffer
import kotlinx.js.ArrayBufferView
import web.buffer.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import websockets.BinaryType

sealed external class RTCDataChannel :
    EventTarget {
    var binaryType: BinaryType
    val bufferedAmount: Number
    var bufferedAmountLowThreshold: Number
    val id: Number?
    val label: String
    val maxPacketLifeTime: Number?
    val maxRetransmits: Number?
    val negotiated: Boolean
    var onbufferedamountlow: EventHandler<Event>?
    var onclose: EventHandler<Event>?
    var onclosing: EventHandler<Event>?
    var onerror: EventHandler<Event>?
    var onmessage: EventHandler<MessageEvent<*>>?
    var onopen: EventHandler<Event>?
    val ordered: Boolean
    val protocol: String
    val readyState: RTCDataChannelState
    fun close()
    fun send(data: String)
    fun send(data: Blob)
    fun send(data: ArrayBuffer)
    fun send(data: ArrayBufferView)
}
