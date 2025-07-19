// Automatically generated - do not modify!

package web.rtc

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.mediastreams.MediaStream
import web.mediastreams.MediaStreamTrack
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`RTCRtpSender`** interface provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender)
 */
open external class RTCRtpSender
private constructor() {
    /**
     * The read-only **`dtmf`** property on the **RTCRtpSender** interface returns a over the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/dtmf)
     */
    val dtmf: RTCDTMFSender?

    /**
     * The **`track`** read-only property of the RTCRtpSender interface returns the MediaStreamTrack which is being handled by the `RTCRtpSender`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/track)
     */
    val track: MediaStreamTrack?

    /**
     * The **`transform`** property of the RTCRtpSender object is used to insert a transform stream (TransformStream) running in a worker thread into the sender pipeline.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transform)
     */
    var transform: RTCRtpTransform?

    /**
     * The read-only **`transport`** property of an used to interact with the underlying transport over which the sender is exchanging Real-time Transport Control Protocol (RTCP) packets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/transport)
     */
    val transport: RTCDtlsTransport?

    /**
     * The **`getParameters()`** method of the RTCRtpSender interface returns an object describing the current configuration for how the sender's RTCRtpSender.track will be encoded and transmitted to a remote RTCRtpReceiver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getParameters)
     */
    fun getParameters(): RTCRtpSendParameters

    /**
     * The RTCRtpSender method **`getStats()`** asynchronously requests an RTCStatsReport object which provides statistics about outgoing traffic on the RTCPeerConnection which owns the sender, returning a Promise which is fulfilled when the results are available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getStats)
     */
    @JsName("getStats")
    fun getStatsAsync(): Promise<RTCStatsReport>

    /**
     * The RTCRtpSender method **`replaceTrack()`** replaces the track currently being used as the sender's source with a new MediaStreamTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/replaceTrack)
     */
    @JsName("replaceTrack")
    fun replaceTrackAsync(withTrack: MediaStreamTrack?): Promise<Void>

    /**
     * The **`setParameters()`** method of the RTCRtpSender interface applies changes the configuration of sender's RTCRtpSender.track, which is the MediaStreamTrack for which the `RTCRtpSender` is responsible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters)
     */
    @JsName("setParameters")
    fun setParametersAsync(
        parameters: RTCRtpSendParameters,
        setParameterOptions: RTCSetParameterOptions = definedExternally,
    ): Promise<Void>

    /**
     * The RTCRtpSender method **`setStreams()`** associates the sender's RTCRtpSender.track with the specified MediaStream objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setStreams)
     */
    fun setStreams(vararg streams: MediaStream)

    companion object {
        /**
         * The _static method_ **`RTCRtpSender.getCapabilities()`** returns an object describing the codec and header extension capabilities supported by the RTCRtpSender.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getCapabilities_static)
         */
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}

/**
 * The RTCRtpSender method **`getStats()`** asynchronously requests an RTCStatsReport object which provides statistics about outgoing traffic on the RTCPeerConnection which owns the sender, returning a Promise which is fulfilled when the results are available.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/getStats)
 */
suspend inline fun RTCRtpSender.getStats(): RTCStatsReport {
    return getStatsAsync().await()
}

/**
 * The RTCRtpSender method **`replaceTrack()`** replaces the track currently being used as the sender's source with a new MediaStreamTrack.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/replaceTrack)
 */
suspend inline fun RTCRtpSender.replaceTrack(withTrack: MediaStreamTrack?) {
    replaceTrackAsync(withTrack = withTrack).await()
}

/**
 * The **`setParameters()`** method of the RTCRtpSender interface applies changes the configuration of sender's RTCRtpSender.track, which is the MediaStreamTrack for which the `RTCRtpSender` is responsible.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters)
 */
suspend inline fun RTCRtpSender.setParameters(
    parameters: RTCRtpSendParameters,
    setParameterOptions: RTCSetParameterOptions,
) {
    setParametersAsync(
        parameters = parameters,
        setParameterOptions = setParameterOptions
    ).await()
}

/**
 * The **`setParameters()`** method of the RTCRtpSender interface applies changes the configuration of sender's RTCRtpSender.track, which is the MediaStreamTrack for which the `RTCRtpSender` is responsible.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpSender/setParameters)
 */
suspend inline fun RTCRtpSender.setParameters(
    parameters: RTCRtpSendParameters,
) {
    setParametersAsync(parameters = parameters).await()
}
