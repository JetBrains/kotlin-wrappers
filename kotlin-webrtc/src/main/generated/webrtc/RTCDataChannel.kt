// Automatically generated - do not modify!

package webrtc

external class RTCDataChannel : org.w3c.dom.events.EventTarget {
    val label: String
    val ordered: Boolean
    val maxPacketLifeTime: Number?
    val maxRetransmits: Number?
    val protocol: String
    val negotiated: Boolean
    val id: Number?
    val readyState: RTCDataChannelState
    val bufferedAmount: Number
    var bufferedAmountLowThreshold: Number

    // binaryType: string;
    fun close()
    fun send(data: String)
    fun send(data: org.w3c.files.Blob)
    fun send(data: org.khronos.webgl.ArrayBuffer)
    fun send(data: org.khronos.webgl.ArrayBufferView)
    var onopen: DataChannelEventHandler<org.w3c.dom.events.Event>
    var onmessage: DataChannelEventHandler<org.w3c.dom.MessageEvent>
    var onbufferedamountlow: DataChannelEventHandler<org.w3c.dom.events.Event>

    // onerror: DataChannelEventHandler<RTCErrorEvent>;
    var onclose: DataChannelEventHandler<org.w3c.dom.events.Event>
}
