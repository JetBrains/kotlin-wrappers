// Automatically generated - do not modify!

package web.rtc

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

/**
 * Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender)
 */
sealed external class RTCRtpSender {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/dtmf)
     */
    val dtmf: RTCDTMFSender?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/track)
     */
    val track: MediaStreamTrack?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transform)
     */
    var transform: RTCRtpTransform?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transport)
     */
    val transport: RTCDtlsTransport?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters)
     */
    fun getParameters(): RTCRtpSendParameters

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getStats)
     */
    @JsAsync
    suspend fun getStats(): RTCStatsReport

    @JsName("getStats")
    fun getStatsAsync(): Promise<RTCStatsReport>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/replaceTrack)
     */
    @JsAsync
    suspend fun replaceTrack(withTrack: MediaStreamTrack?)

    @JsName("replaceTrack")
    fun replaceTrackAsync(withTrack: MediaStreamTrack?): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters)
     */
    @JsAsync
    suspend fun setParameters(
        parameters: RTCRtpSendParameters,
        setParameterOptions: RTCSetParameterOptions = definedExternally,
    )

    @JsName("setParameters")
    fun setParametersAsync(
        parameters: RTCRtpSendParameters,
        setParameterOptions: RTCSetParameterOptions = definedExternally,
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setStreams)
     */
    fun setStreams(vararg streams: MediaStream)

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getCapabilities_static)
         */
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}
