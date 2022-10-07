// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.stream.MediaStream
import media.stream.MediaStreamTrack

sealed external interface RTCRtpSender {
    val dtmf: RTCDTMFSender?
    val track: MediaStreamTrack?
    val transport: RTCDtlsTransport?
    fun getParameters(): RTCRtpSendParameters
    fun getStats(): kotlin.js.Promise<RTCStatsReport>
    fun replaceTrack(withTrack: MediaStreamTrack?): kotlin.js.Promise<Unit>
    fun setParameters(parameters: RTCRtpSendParameters): kotlin.js.Promise<Unit>
    fun setStreams(vararg streams: ReadonlyArray<MediaStream>)
}
