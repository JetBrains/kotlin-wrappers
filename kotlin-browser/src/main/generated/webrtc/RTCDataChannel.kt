// Automatically generated - do not modify!

package webrtc

import org.w3c.dom.MessageEvent
import org.w3c.dom.events.Event

external class RTCDataChannel : org.w3c.dom.events.EventTarget {
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
    var onmessage: ((event: MessageEvent) -> Unit)?
    var onopen: ((event: Event) -> Unit)?
    val ordered: Boolean
    val protocol: String
    val readyState: RTCDataChannelState
    fun close()
    fun send(data: String)
    fun send(data: org.w3c.files.Blob)
    fun send(data: kotlinx.js.ArrayBuffer)
    fun send(data: kotlinx.js.ArrayBufferView)
    // addEventListener<K extends keyof RTCDataChannelEventMap>(type: K, listener: (this: RTCDataChannel, ev: RTCDataChannelEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCDataChannelEventMap>(type: K, listener: (this: RTCDataChannel, ev: RTCDataChannelEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
