// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpSender {
    val dtmf: RTCDTMFSender?
    val track: media.stream.MediaStreamTrack?
    val transport: RTCDtlsTransport?
    fun getParameters(): RTCRtpSendParameters
    fun getStats(): kotlin.js.Promise<RTCStatsReport>
    fun replaceTrack(withTrack: media.stream.MediaStreamTrack?): kotlin.js.Promise<Unit>
    fun setParameters(parameters: RTCRtpSendParameters): kotlin.js.Promise<Unit>
    fun setStreams(vararg streams: ReadonlyArray<media.stream.MediaStream>)
}
