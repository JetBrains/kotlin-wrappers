// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

external class RTCDtlsTransport : org.w3c.dom.events.EventTarget {
    val iceTransport: RTCIceTransport
    val state: RTCDtlsTransportState
    fun getRemoteCertificates(): ReadonlyArray<org.khronos.webgl.ArrayBuffer>
    var onerror: DtlsTransportEventHandler<org.w3c.dom.events.Event>
    var onstatechange: DtlsTransportEventHandler<org.w3c.dom.events.Event>
    // addEventListener<K extends keyof RTCDtlsTransportEventMap>(type: K, listener: (this: RTCDtlsTransport, ev: RTCDtlsTransportEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCDtlsTransportEventMap>(type: K, listener: (this: RTCDtlsTransport, ev: RTCDtlsTransportEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
