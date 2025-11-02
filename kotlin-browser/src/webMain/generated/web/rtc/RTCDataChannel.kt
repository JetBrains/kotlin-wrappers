// Automatically generated - do not modify!

package web.rtc

import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferView
import js.closeable.JsCloseable
import js.serialization.Transferable
import web.blob.Blob
import web.buffer.BinaryType
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import kotlin.js.JsAny

/**
 * The **`RTCDataChannel`** interface represents a network channel which can be used for bidirectional peer-to-peer transfers of arbitrary data. Every data channel is associated with an RTCPeerConnection, and each peer connection can have up to a theoretical maximum of 65,534 data channels (the actual limit may vary from browser to browser).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel)
 */
open external class RTCDataChannel
private constructor() :
    EventTarget,
    Transferable,
    JsCloseable {
    /**
     * The property **`binaryType`** on the RTCDataChannel interface is a string which specifies the type of object which should be used to represent binary data received on the RTCDataChannel. Values allowed by the WebSocket.binaryType property are also permitted here: blob if Blob objects are being used or arraybuffer if ArrayBuffer objects are being used. The default is arraybuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType)
     */
    var binaryType: BinaryType

    /**
     * The read-only RTCDataChannel property **`bufferedAmount`** returns the number of bytes of data currently queued to be sent over the data channel. The queue may build up as a result of calls to the send() method. This only includes data buffered by the user agent itself; it doesn't include any framing overhead or buffering done by the operating system or network hardware.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmount)
     */
    val bufferedAmount: Int

    /**
     * The RTCDataChannel property **`bufferedAmountLowThreshold`** is used to specify the number of bytes of buffered outgoing data that is considered "low." The default value is 0. When the number of buffered outgoing bytes, as indicated by the bufferedAmount property, falls to or below this value, a bufferedamountlow event is fired. This event may be used, for example, to implement code which queues more messages to be sent whenever there's room to buffer them. Listeners may be added with onbufferedamountlow or addEventListener().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmountLowThreshold)
     */
    var bufferedAmountLowThreshold: Int

    /**
     * The read-only RTCDataChannel property **`id`** returns an ID number (between 0 and 65,534) which uniquely identifies the RTCDataChannel. This ID is set at the time the data channel is created, either by the user agent (if RTCDataChannel.negotiated is false) or by the site or app script (if negotiated is true).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/id)
     */
    val id: Short?

    /**
     * The read-only RTCDataChannel property **`label`** returns a string containing a name describing the data channel. These labels are not required to be unique.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/label)
     */
    val label: String

    /**
     * The read-only RTCDataChannel property **`maxPacketLifeTime`** returns the amount of time, in milliseconds, the browser is allowed to take to attempt to transmit a message, as set when the data channel was created, or null. This limits how long the browser can continue to attempt to transmit and retransmit the message before giving up.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxPacketLifeTime)
     */
    val maxPacketLifeTime: Short?

    /**
     * The read-only RTCDataChannel property **`maxRetransmits`** returns the maximum number of times the browser should try to retransmit a message before giving up, as set when the data channel was created, or null, which indicates that there is no maximum. This can only be set when the RTCDataChannel is created by calling RTCPeerConnection.createDataChannel(), using the maxRetransmits field in the specified options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxRetransmits)
     */
    val maxRetransmits: Short?

    /**
     * The read-only RTCDataChannel property **`negotiated`** indicates whether the RTCDataChannel's connection was negotiated by the Web app (true) or by the WebRTC layer (false). The default is false.
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
     * The read-only RTCDataChannel property **`ordered`** indicates whether or not the data channel guarantees in-order delivery of messages; the default is true, which indicates that the data channel is indeed ordered. This is set when the RTCDataChannel is created, by setting the ordered property on the object passed as RTCPeerConnection.createDataChannel()'s options parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/ordered)
     */
    val ordered: Boolean

    /**
     * The read-only RTCDataChannel property **`protocol`** returns a string containing the name of the subprotocol in use. If no protocol was specified when the data channel was created, then this property's value is the empty string ("").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/protocol)
     */
    val protocol: String

    /**
     * The read-only RTCDataChannel property **`readyState`** returns a string which indicates the state of the data channel's underlying data connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState)
     */
    val readyState: RTCDataChannelState

    /**
     * The **`RTCDataChannel.close()`** method closes the RTCDataChannel. Either peer is permitted to call this method to initiate closure of the channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close)
     */
    override fun close()

    /**
     * The **`send()`** method of the RTCDataChannel interface sends data across the data channel to the remote peer. This can be done any time except during the initial process of creating the underlying transport channel. Data sent before connecting is buffered if possible (or an error occurs if it's not possible), and is also buffered if sent while the connection is closing or closed.
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
