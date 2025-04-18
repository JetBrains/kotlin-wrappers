// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.crypto.Algorithm
import web.events.*
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`RTCPeerConnection`** interface represents a WebRTC connection between the local computer and a remote peer.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection)
 */
open external class RTCPeerConnection(
    configuration: RTCConfiguration = definedExternally,
) : EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/canTrickleIceCandidates)
     */
    val canTrickleIceCandidates: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState)
     */
    val connectionState: RTCPeerConnectionState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentLocalDescription)
     */
    val currentLocalDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentRemoteDescription)
     */
    val currentRemoteDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState)
     */
    val iceConnectionState: RTCIceConnectionState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState)
     */
    val iceGatheringState: RTCIceGatheringState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/localDescription)
     */
    val localDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event)
     */
    var onconnectionstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event)
     */
    var ondatachannel: EventHandler<RTCDataChannelEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event)
     */
    var onicecandidate: EventHandler<RTCPeerConnectionIceEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event)
     */
    var onicecandidateerror: EventHandler<RTCPeerConnectionIceErrorEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event)
     */
    var oniceconnectionstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event)
     */
    var onicegatheringstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event)
     */
    var onnegotiationneeded: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event)
     */
    var onsignalingstatechange: EventHandler<Event, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event)
     */
    var ontrack: EventHandler<RTCTrackEvent, RTCPeerConnection, RTCPeerConnection>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingLocalDescription)
     */
    val pendingLocalDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingRemoteDescription)
     */
    val pendingRemoteDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/remoteDescription)
     */
    val remoteDescription: RTCSessionDescription?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/sctp)
     */
    val sctp: RTCSctpTransport?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState)
     */
    val signalingState: RTCSignalingState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addIceCandidate)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun addIceCandidate(candidate: RTCIceCandidateInit? = definedExternally)

    @JsName("addIceCandidate")
    fun addIceCandidateAsync(candidate: RTCIceCandidateInit? = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTrack)
     */
    fun addTrack(
        track: MediaStreamTrack,
        vararg streams: MediaStream,
    ): RTCRtpSender

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver)
     */
    fun addTransceiver(
        trackOrKind: MediaStreamTrack,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    fun addTransceiver(
        trackOrKind: String,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/close)
     */
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createAnswer)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createAnswer(options: RTCAnswerOptions = definedExternally): RTCSessionDescriptionInit

    @JsName("createAnswer")
    fun createAnswerAsync(options: RTCAnswerOptions = definedExternally): Promise<RTCSessionDescriptionInit>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createDataChannel)
     */
    fun createDataChannel(
        label: String,
        dataChannelDict: RTCDataChannelInit = definedExternally,
    ): RTCDataChannel

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun createOffer(options: RTCOfferOptions = definedExternally): RTCSessionDescriptionInit

    @JsName("createOffer")
    fun createOfferAsync(options: RTCOfferOptions = definedExternally): Promise<RTCSessionDescriptionInit>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration)
     */
    fun getConfiguration(): RTCConfiguration

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getReceivers)
     */
    fun getReceivers(): ReadonlyArray<RTCRtpReceiver>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getSenders)
     */
    fun getSenders(): ReadonlyArray<RTCRtpSender>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getStats)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getStats(selector: MediaStreamTrack? = definedExternally): RTCStatsReport

    @JsName("getStats")
    fun getStatsAsync(selector: MediaStreamTrack? = definedExternally): Promise<RTCStatsReport>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getTransceivers)
     */
    fun getTransceivers(): ReadonlyArray<RTCRtpTransceiver>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/removeTrack)
     */
    fun removeTrack(sender: RTCRtpSender)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/restartIce)
     */
    fun restartIce()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration)
     */
    fun setConfiguration(configuration: RTCConfiguration = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setLocalDescription)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setLocalDescription(description: RTCLocalSessionDescriptionInit = definedExternally)

    @JsName("setLocalDescription")
    fun setLocalDescriptionAsync(description: RTCLocalSessionDescriptionInit = definedExternally): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setRemoteDescription)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setRemoteDescription(description: RTCSessionDescriptionInit)

    @JsName("setRemoteDescription")
    fun setRemoteDescriptionAsync(description: RTCSessionDescriptionInit): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event)
     */
    @JsEvent("connectionstatechange")
    val connectionStateChangeEvent: EventInstance<Event, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event)
     */
    @JsEvent("datachannel")
    val dataChannelEvent: EventInstance<RTCDataChannelEvent, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event)
     */
    @JsEvent("icecandidate")
    val iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event)
     */
    @JsEvent("icecandidateerror")
    val iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event)
     */
    @JsEvent("iceconnectionstatechange")
    val iceConnectionStateChangeEvent: EventInstance<Event, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event)
     */
    @JsEvent("icegatheringstatechange")
    val iceGatheringStateChangeEvent: EventInstance<Event, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event)
     */
    @JsEvent("negotiationneeded")
    val negotiationNeededEvent: EventInstance<Event, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event)
     */
    @JsEvent("signalingstatechange")
    val signalingStateChangeEvent: EventInstance<Event, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event)
     */
    @JsEvent("track")
    val trackEvent: EventInstance<RTCTrackEvent, RTCPeerConnection /* this */, RTCPeerConnection /* this */>

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/generateCertificate_static)
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun generateCertificate(keygenAlgorithm: Algorithm): RTCCertificate

        @JsName("generateCertificate")
        fun generateCertificateAsync(keygenAlgorithm: Algorithm): Promise<RTCCertificate>

        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun generateCertificate(keygenAlgorithm: String): RTCCertificate

        @JsName("generateCertificate")
        fun generateCertificateAsync(keygenAlgorithm: String): Promise<RTCCertificate>
    }
}
