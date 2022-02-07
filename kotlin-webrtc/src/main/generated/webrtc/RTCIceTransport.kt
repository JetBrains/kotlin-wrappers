// Automatically generated - do not modify!

package webrtc

import kotlinext.js.ReadonlyArray

external class RTCIceTransport : org.w3c.dom.events.EventTarget {
    val role: RTCIceRole

    //readonly component: RTCIceComponent;
    //readonly state: RTCIceTransportState;
    val gatheringState: RTCIceGatheringState
    fun getLocalCandidates(): ReadonlyArray<RTCIceCandidate>
    fun getRemoteCandidates(): ReadonlyArray<RTCIceCandidate>
    fun getLocalParameters(): RTCIceParameters?
    fun getRemoteParameters(): RTCIceParameters?
    fun getSelectedCandidatePair(): RTCIceCandidatePair?
    var onstatechange: IceTransportEventHandler
    var ongatheringstatechange: IceTransportEventHandler
    var onselectedcandidatepairchange: IceTransportEventHandler
    // addEventListener<K extends keyof RTCIceTransportEventMap>(type: K, listener: (this: RTCIceTransport, ev: RTCIceTransportEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCIceTransportEventMap>(type: K, listener: (this: RTCIceTransport, ev: RTCIceTransportEventMap[K]) => any, options: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void
}
