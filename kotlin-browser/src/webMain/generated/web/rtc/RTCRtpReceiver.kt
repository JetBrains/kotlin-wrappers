// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.mediastreams.MediaStreamTrack
import web.time.DOMHighResTimeStamp
import kotlin.js.JsName

/**
 * The **`RTCRtpReceiver`** interface of the WebRTC API manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver)
 */
open external class RTCRtpReceiver
private constructor() {
    /**
     * The **`jitterBufferTarget`** property of the RTCRtpReceiver interface is a DOMHighResTimeStamp that indicates the application's preferred duration, in milliseconds, for which the jitter buffer should hold media before playing it out.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/jitterBufferTarget)
     */
    var jitterBufferTarget: DOMHighResTimeStamp?

    /**
     * The **`track`** read-only property of the RTCRtpReceiver interface returns the MediaStreamTrack associated with the current RTCRtpReceiver instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/track)
     */
    val track: MediaStreamTrack

    /**
     * The **`transform`** property of the RTCRtpReceiver object is used to insert a transform stream (TransformStream) running in a worker thread into the receiver pipeline. This allows stream transforms to be applied to encoded video and audio frames as they arrive from the packetizer (before they are played/rendered).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transform)
     */
    var transform: RTCRtpReceiverTransform?

    /**
     * The read-only **`transport`** property of an RTCRtpReceiver object provides the RTCDtlsTransport object used to interact with the underlying transport over which the receiver is exchanging Real-time Transport Control Protocol (RTCP) packets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/transport)
     */
    val transport: RTCDtlsTransport?

    /**
     * The **`getContributingSources()`** method of the RTCRtpReceiver interface returns an array of objects, each corresponding to one CSRC (contributing source) identifier received by the current RTCRtpReceiver in the last ten seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getContributingSources)
     */
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>

    /**
     * The **`getParameters()`** method of the RTCRtpReceiver interface returns an object describing the current configuration for how the receiver's track is decoded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getParameters)
     */
    fun getParameters(): RTCRtpReceiveParameters

    /**
     * The RTCRtpReceiver method **`getStats()`** asynchronously requests an RTCStatsReport object which provides statistics about incoming traffic on the owning RTCPeerConnection, returning a Promise whose fulfillment handler will be called once the results are available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getStats)
     */
    @JsName("getStats")
    fun getStatsAsync(): Promise<RTCStatsReport>

    /**
     * The **`getSynchronizationSources()`** method of the RTCRtpReceiver interface returns an array of objects, each corresponding to one SSRC (synchronization source) identifier received by the current RTCRtpReceiver in the last ten seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getSynchronizationSources)
     */
    fun getSynchronizationSources(): ReadonlyArray<RTCRtpSynchronizationSource>

    companion object {
        /**
         * The static method **`RTCRtpReceiver.getCapabilities()`** returns an object describing the codec and header extension capabilities supported by RTCRtpReceiver objects on the current device.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getCapabilities_static)
         */
        fun getCapabilities(kind: String): RTCRtpCapabilities?
    }
}

/**
 * The RTCRtpReceiver method **`getStats()`** asynchronously requests an RTCStatsReport object which provides statistics about incoming traffic on the owning RTCPeerConnection, returning a Promise whose fulfillment handler will be called once the results are available.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpReceiver/getStats)
 */
suspend inline fun RTCRtpReceiver.getStats(): RTCStatsReport {
    return getStatsAsync().await()
}
