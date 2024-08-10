// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue

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

        @JsValue("media-playout")
        val mediaPlayout: RTCStatsType

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
