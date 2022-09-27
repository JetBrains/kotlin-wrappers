// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpSender {
    val dtmf: RTCDTMFSender?
    val track: org.w3c.dom.mediacapture.MediaStreamTrack?
    val transport: RTCDtlsTransport?
    fun getParameters(): RTCRtpSendParameters
    fun getStats(): kotlin.js.Promise<RTCStatsReport>
    fun replaceTrack(withTrack: org.w3c.dom.mediacapture.MediaStreamTrack?): kotlin.js.Promise<Unit>
    fun setParameters(parameters: RTCRtpSendParameters): kotlin.js.Promise<Unit>
    fun setStreams(vararg streams: ReadonlyArray<org.w3c.dom.mediacapture.MediaStream>)
}
