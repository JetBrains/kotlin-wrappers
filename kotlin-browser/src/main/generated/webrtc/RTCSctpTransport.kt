// Automatically generated - do not modify!

package webrtc

import web.events.Event

external class RTCSctpTransport : web.events.EventTarget {
    val maxChannels: Number?
    val maxMessageSize: Number
    var onstatechange: ((event: Event) -> Unit)?
    val state: RTCSctpTransportState
    val transport: RTCDtlsTransport
    // addEventListener<K extends keyof RTCSctpTransportEventMap>(type: K, listener: (this: RTCSctpTransport, ev: RTCSctpTransportEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCSctpTransportEventMap>(type: K, listener: (this: RTCSctpTransport, ev: RTCSctpTransportEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
