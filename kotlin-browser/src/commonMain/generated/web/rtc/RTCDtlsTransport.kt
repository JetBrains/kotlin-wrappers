// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import web.events.*

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport)
 */
external class RTCDtlsTransport
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/iceTransport)
     */
    val iceTransport: RTCIceTransport

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/error_event)
     */
    var onerror: EventHandler<RTCErrorEvent, RTCDtlsTransport, RTCDtlsTransport>?
    var onstatechange: EventHandler<Event, RTCDtlsTransport, RTCDtlsTransport>?

    /**
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
