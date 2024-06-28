// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import web.blob.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.sockets.BinaryType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel)
 */
sealed external class RTCDataChannel :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType)
     */
    var binaryType: BinaryType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmount)
     */
    val bufferedAmount: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmountLowThreshold)
     */
    var bufferedAmountLowThreshold: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/id)
     */
    val id: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/label)
     */
    val label: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxPacketLifeTime)
     */
    val maxPacketLifeTime: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxRetransmits)
     */
    val maxRetransmits: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/negotiated)
     */
    val negotiated: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedamountlow_event)
     */
    var onbufferedamountlow: EventHandler<Event, RTCDataChannel, RTCDataChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close_event)
     */
    var onclose: EventHandler<Event, RTCDataChannel, RTCDataChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/closing_event)
     */
    var onclosing: EventHandler<Event, RTCDataChannel, RTCDataChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/error_event)
     */
    var onerror: EventHandler<RTCErrorEvent, RTCDataChannel, RTCDataChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, RTCDataChannel, RTCDataChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/open_event)
     */
    var onopen: EventHandler<Event, RTCDataChannel, RTCDataChannel>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/ordered)
     */
    val ordered: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/protocol)
     */
    val protocol: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState)
     */
    val readyState: RTCDataChannelState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/send)
     */
    fun send(data: String)
    fun send(data: Blob)
    fun send(data: ArrayBuffer)
    fun send(data: ArrayBufferView)
}
