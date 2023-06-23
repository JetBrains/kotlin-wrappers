// Automatically generated - do not modify!

package webrtc

import js.core.Void
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack
import kotlin.js.Promise

/**
 * Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender)
 */
sealed external class RTCRtpSender {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/dtmf) */
    val dtmf: RTCDTMFSender?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/track) */
    val track: MediaStreamTrack?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transport) */
    val transport: RTCDtlsTransport?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters) */
    fun getParameters(): RTCRtpSendParameters

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getStats) */
    fun getStats(): Promise<RTCStatsReport>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/replaceTrack) */
    fun replaceTrack(withTrack: MediaStreamTrack?): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters) */
    fun setParameters(parameters: RTCRtpSendParameters): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setStreams) */
    fun setStreams(vararg streams: MediaStream)

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getCapabilities_static) */
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}
