// Automatically generated - do not modify!

package webrtc

import org.w3c.dom.events.Event

external class RTCIceTransport : org.w3c.dom.events.EventTarget {
    val gatheringState: RTCIceGathererState
    var ongatheringstatechange: ((event: Event) -> Unit)?
    var onstatechange: ((event: Event) -> Unit)?
    val state: RTCIceTransportState
    // addEventListener<K extends keyof RTCIceTransportEventMap>(type: K, listener: (this: RTCIceTransport, ev: RTCIceTransportEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCIceTransportEventMap>(type: K, listener: (this: RTCIceTransport, ev: RTCIceTransportEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
