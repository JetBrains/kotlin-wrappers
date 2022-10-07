// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.stream.MediaStreamTrack

sealed external interface RTCRtpReceiver {
    val track: MediaStreamTrack
    val transport: RTCDtlsTransport?
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>
    fun getParameters(): RTCRtpReceiveParameters
    fun getStats(): kotlin.js.Promise<RTCStatsReport>
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>
}
