// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport) */
sealed external class RTCDtlsTransport :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/iceTransport) */
    val iceTransport: RTCIceTransport
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/statechange_event) */
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/state) */
    val state: RTCDtlsTransportState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDtlsTransport/getRemoteCertificates) */
    fun getRemoteCertificates(): ReadonlyArray<ArrayBuffer>
}
