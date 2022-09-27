// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpReceiver {
    val track: org.w3c.dom.mediacapture.MediaStreamTrack
    val transport: RTCDtlsTransport?
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>
    fun getParameters(): RTCRtpReceiveParameters
    fun getStats(): kotlin.js.Promise<RTCStatsReport>
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>
}
