// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpReceiver {
    val track: media.stream.MediaStreamTrack
    val transport: RTCDtlsTransport?
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>
    fun getParameters(): RTCRtpReceiveParameters
    fun getStats(): kotlin.js.Promise<RTCStatsReport>
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>
}
