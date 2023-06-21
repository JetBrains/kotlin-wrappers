// Automatically generated - do not modify!

package webrtc

import js.core.ReadonlyArray
import web.media.streams.MediaStreamTrack
import kotlin.js.Promise

sealed external class RTCRtpReceiver {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/track) */
    val track: MediaStreamTrack

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transport) */
    val transport: RTCDtlsTransport?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getContributingSources) */
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getParameters) */
    fun getParameters(): RTCRtpReceiveParameters

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getStats) */
    fun getStats(): Promise<RTCStatsReport>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getSynchronizationSources) */
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getCapabilities_static) */
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}
