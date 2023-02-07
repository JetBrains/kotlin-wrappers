// Automatically generated - do not modify!

package webrtc

import js.core.Void
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack
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

    companion object {
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}
