// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.streams.MediaStreamTrack
import kotlin.js.Promise

sealed external class RTCRtpReceiver {
    val track: MediaStreamTrack
    val transport: RTCDtlsTransport?
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>
    fun getParameters(): RTCRtpReceiveParameters
    fun getStats(): Promise<RTCStatsReport>
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>
}
