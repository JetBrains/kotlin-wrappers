// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.core.JsAny
import js.serialization.Transferable
import web.blob.Blob
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import web.sockets.BinaryType

/**
 * The **`RTCDataChannel`** interface represents a network channel which can be used for bidirectional peer-to-peer transfers of arbitrary data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel)
 */
open external class RTCDataChannel
private constructor() :
    EventTarget,
    Transferable {
    /**
     * The property **`binaryType`** on the RTCDataChannel interface is a string which specifies the type of object which should be used to represent binary data received on the RTCDataChannel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType)
     */
    var binaryType: BinaryType

    /**
     * The read-only `RTCDataChannel` property **`bufferedAmount`** returns the number of bytes of data currently queued to be sent over the data channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmount)
     */
    val bufferedAmount: Int

    /**
     * The `RTCDataChannel` property **`bufferedAmountLowThreshold`** is used to specify the number of bytes of buffered outgoing data that is considered 'low.' The default value is 0\.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmountLowThreshold)
     */
    var bufferedAmountLowThreshold: Int

    /**
     * The read-only `RTCDataChannel` property **`id`** returns an ID number (between 0 and 65,534) which uniquely identifies the RTCDataChannel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/id)
     */
    val id: Short?

    /**
     * The read-only `RTCDataChannel` property **`label`** returns a string containing a name describing the data channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/label)
     */
    val label: String

    /**
     * The read-only `RTCDataChannel` property **`maxPacketLifeTime`** returns the amount of time, in milliseconds, the browser is allowed to take to attempt to transmit a message, as set when the data channel was created, or `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxPacketLifeTime)
     */
    val maxPacketLifeTime: Short?

    /**
     * The read-only `RTCDataChannel` property **`maxRetransmits`** returns the maximum number of times the browser should try to retransmit a message before giving up, as set when the data channel was created, or `null`, which indicates that there is no maximum.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxRetransmits)
     */
    val maxRetransmits: Short?

    /**
     * The read-only `RTCDataChannel` property **`negotiated`** indicates whether the RTCDataChannel's connection was negotiated by the Web app (`true`) or by the WebRTC layer (`false`).
     *
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
     * The read-only `RTCDataChannel` property **`ordered`** indicates whether or not the data channel guarantees in-order delivery of messages; the default is `true`, which indicates that the data channel is indeed ordered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/ordered)
     */
    val ordered: Boolean

    /**
     * The read-only `RTCDataChannel` property **`protocol`** returns a string containing the name of the subprotocol in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/protocol)
     */
    val protocol: String

    /**
     * The read-only `RTCDataChannel` property **`readyState`** returns a string which indicates the state of the data channel's underlying data connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState)
     */
    val readyState: RTCDataChannelState

    /**
     * The **`RTCDataChannel.close()`** method closes the RTCDataChannel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close)
     */
    fun close()

    /**
     * The **`send()`** method of the RTCDataChannel interface sends data across the data channel to the remote peer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/send)
     */
    fun send(data: String)
    fun send(data: Blob)
    fun send(data: ArrayBuffer)
    fun send(data: ArrayBufferView<ArrayBuffer>)
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedamountlow_event)
 */
inline val <C : RTCDataChannel> C.bufferedAmountLowEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "bufferedamountlow")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close_event)
 */
inline val <C : RTCDataChannel> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "close")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/closing_event)
 */
inline val <C : RTCDataChannel> C.closingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "closing")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/error_event)
 */
inline val <C : RTCDataChannel> C.errorEvent: EventInstance<RTCErrorEvent, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/message_event)
 */
inline val <C : RTCDataChannel> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/open_event)
 */
inline val <C : RTCDataChannel> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "open")
