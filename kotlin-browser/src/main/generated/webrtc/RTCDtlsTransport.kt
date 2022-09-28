// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import web.events.Event

external class RTCDtlsTransport : web.events.EventTarget {
    val iceTransport: RTCIceTransport
    var onerror: ((event: Event) -> Unit)?
    var onstatechange: ((event: Event) -> Unit)?
    val state: RTCDtlsTransportState
    fun getRemoteCertificates(): ReadonlyArray<kotlinx.js.ArrayBuffer>
    // addEventListener<K extends keyof RTCDtlsTransportEventMap>(type: K, listener: (this: RTCDtlsTransport, ev: RTCDtlsTransportEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCDtlsTransportEventMap>(type: K, listener: (this: RTCDtlsTransport, ev: RTCDtlsTransportEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
