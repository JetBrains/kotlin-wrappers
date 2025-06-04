// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import web.events.*

/**
 * The **`RTCDtlsTransport`** interface provides access to information about the Datagram Transport Layer Security (**DTLS**) transport over which a RTCPeerConnection's RTP and RTCP packets are sent and received by its RTCRtpSender and RTCRtpReceiver objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport)
 */
external class RTCDtlsTransport
private constructor() :
    EventTarget {
    /**
     * The **`iceTransport`** read-only property of the **RTCDtlsTransport** interface contains a reference to the underlying RTCIceTransport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/iceTransport)
     */
    val iceTransport: RTCIceTransport

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/error_event)
     */
    var onerror: EventHandler<RTCErrorEvent, RTCDtlsTransport, RTCDtlsTransport>?
    var onstatechange: EventHandler<Event, RTCDtlsTransport, RTCDtlsTransport>?

    /**
     * The **`state`** read-only property of the Datagram Transport Layer Security (**DTLS**) transport state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state)
     */
    val state: RTCDtlsTransportState
    fun getRemoteCertificates(): ReadonlyArray<ArrayBuffer>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<RTCErrorEvent, RTCDtlsTransport /* this */, RTCDtlsTransport /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/statechange_event)
     */
    @JsEvent("statechange")
    val stateChangeEvent: EventInstance<Event, RTCDtlsTransport /* this */, RTCDtlsTransport /* this */>
}
