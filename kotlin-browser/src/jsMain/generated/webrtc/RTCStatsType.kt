// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RTCStatsType {
    companion object {
        @JsValue("candidate-pair")
        val candidatePair: RTCStatsType

        @JsValue("certificate")
        val certificate: RTCStatsType

        @JsValue("codec")
        val codec: RTCStatsType

        @JsValue("data-channel")
        val dataChannel: RTCStatsType

        @JsValue("inbound-rtp")
        val inboundRtp: RTCStatsType

        @JsValue("local-candidate")
        val localCandidate: RTCStatsType

        @JsValue("media-source")
        val mediaSource: RTCStatsType

        @JsValue("outbound-rtp")
        val outboundRtp: RTCStatsType

        @JsValue("peer-connection")
        val peerConnection: RTCStatsType

        @JsValue("remote-candidate")
        val remoteCandidate: RTCStatsType

        @JsValue("remote-inbound-rtp")
        val remoteInboundRtp: RTCStatsType

        @JsValue("remote-outbound-rtp")
        val remoteOutboundRtp: RTCStatsType

        @JsValue("transport")
        val transport: RTCStatsType
    }
}
