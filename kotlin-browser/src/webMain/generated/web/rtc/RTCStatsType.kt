// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCStatsType {
    companion object
}

inline val RTCStatsType.Companion.candidatePair: RTCStatsType
    get() = unsafeCast("candidate-pair")

inline val RTCStatsType.Companion.certificate: RTCStatsType
    get() = unsafeCast("certificate")

inline val RTCStatsType.Companion.codec: RTCStatsType
    get() = unsafeCast("codec")

inline val RTCStatsType.Companion.dataChannel: RTCStatsType
    get() = unsafeCast("data-channel")

inline val RTCStatsType.Companion.inboundRtp: RTCStatsType
    get() = unsafeCast("inbound-rtp")

inline val RTCStatsType.Companion.localCandidate: RTCStatsType
    get() = unsafeCast("local-candidate")

inline val RTCStatsType.Companion.mediaPlayout: RTCStatsType
    get() = unsafeCast("media-playout")

inline val RTCStatsType.Companion.mediaSource: RTCStatsType
    get() = unsafeCast("media-source")

inline val RTCStatsType.Companion.outboundRtp: RTCStatsType
    get() = unsafeCast("outbound-rtp")

inline val RTCStatsType.Companion.peerConnection: RTCStatsType
    get() = unsafeCast("peer-connection")

inline val RTCStatsType.Companion.remoteCandidate: RTCStatsType
    get() = unsafeCast("remote-candidate")

inline val RTCStatsType.Companion.remoteInboundRtp: RTCStatsType
    get() = unsafeCast("remote-inbound-rtp")

inline val RTCStatsType.Companion.remoteOutboundRtp: RTCStatsType
    get() = unsafeCast("remote-outbound-rtp")

inline val RTCStatsType.Companion.transport: RTCStatsType
    get() = unsafeCast("transport")
