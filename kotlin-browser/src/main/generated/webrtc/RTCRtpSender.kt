// Automatically generated - do not modify!

package webrtc

import kotlinx.js.Void
import media.streams.MediaStream
import media.streams.MediaStreamTrack
import kotlin.js.Promise

sealed external class RTCRtpSender {
    val dtmf: RTCDTMFSender?
    val track: MediaStreamTrack?
    val transport: RTCDtlsTransport?
    fun getParameters(): RTCRtpSendParameters
    fun getStats(): Promise<RTCStatsReport>
    fun replaceTrack(withTrack: MediaStreamTrack?): Promise<Void>
    fun setParameters(parameters: RTCRtpSendParameters): Promise<Void>
    fun setStreams(vararg streams: MediaStream)
}
