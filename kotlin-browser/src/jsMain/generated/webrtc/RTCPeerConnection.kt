// Automatically generated - do not modify!

package webrtc

import js.core.ReadonlyArray
import js.core.Void
import js.promise.Promise
import web.crypto.Algorithm
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.media.streams.MediaStream
import web.media.streams.MediaStreamTrack

/**
 * A WebRTC connection between the local computer and a remote peer. It provides methods to connect to a remote peer, maintain and monitor the connection, and close the connection once it's no longer needed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection)
 */
external class RTCPeerConnection(
    configuration: RTCConfiguration = definedExternally,
) : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/canTrickleIceCandidates) */
    val canTrickleIceCandidates: Boolean?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionState) */
    val connectionState: RTCPeerConnectionState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentLocalDescription) */
    val currentLocalDescription: RTCSessionDescription?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/currentRemoteDescription) */
    val currentRemoteDescription: RTCSessionDescription?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceConnectionState) */
    val iceConnectionState: RTCIceConnectionState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceGatheringState) */
    val iceGatheringState: RTCIceGatheringState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/localDescription) */
    val localDescription: RTCSessionDescription?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/connectionstatechange_event) */
    var onconnectionstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/datachannel_event) */
    var ondatachannel: EventHandler<RTCDataChannelEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidate_event) */
    var onicecandidate: EventHandler<RTCPeerConnectionIceEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icecandidateerror_event) */
    var onicecandidateerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/iceconnectionstatechange_event) */
    var oniceconnectionstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/icegatheringstatechange_event) */
    var onicegatheringstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/negotiationneeded_event) */
    var onnegotiationneeded: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingstatechange_event) */
    var onsignalingstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/track_event) */
    var ontrack: EventHandler<RTCTrackEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingLocalDescription) */
    val pendingLocalDescription: RTCSessionDescription?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/pendingRemoteDescription) */
    val pendingRemoteDescription: RTCSessionDescription?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/remoteDescription) */
    val remoteDescription: RTCSessionDescription?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/sctp) */
    val sctp: RTCSctpTransport?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState) */
    val signalingState: RTCSignalingState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addIceCandidate) */
    fun addIceCandidate(candidate: RTCIceCandidateInit = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTrack) */
    fun addTrack(
        track: MediaStreamTrack,
        vararg streams: MediaStream,
    ): RTCRtpSender

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/addTransceiver) */
    fun addTransceiver(
        trackOrKind: MediaStreamTrack,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    fun addTransceiver(
        trackOrKind: String,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/close) */
    fun close()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createAnswer) */
    fun createAnswer(options: RTCAnswerOptions = definedExternally): Promise<RTCSessionDescriptionInit>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createDataChannel) */
    fun createDataChannel(
        label: String,
        dataChannelDict: RTCDataChannelInit = definedExternally,
    ): RTCDataChannel

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/createOffer) */
    fun createOffer(options: RTCOfferOptions = definedExternally): Promise<RTCSessionDescriptionInit>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration) */
    fun getConfiguration(): RTCConfiguration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getReceivers) */
    fun getReceivers(): ReadonlyArray<RTCRtpReceiver>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getSenders) */
    fun getSenders(): ReadonlyArray<RTCRtpSender>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getStats) */
    fun getStats(selector: MediaStreamTrack? = definedExternally): Promise<RTCStatsReport>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getTransceivers) */
    fun getTransceivers(): ReadonlyArray<RTCRtpTransceiver>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/removeTrack) */
    fun removeTrack(sender: RTCRtpSender)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/restartIce) */
    fun restartIce()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration) */
    fun setConfiguration(configuration: RTCConfiguration = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setLocalDescription) */
    fun setLocalDescription(description: RTCLocalSessionDescriptionInit = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setRemoteDescription) */
    fun setRemoteDescription(description: RTCSessionDescriptionInit): Promise<Void>

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/generateCertificate_static) */
        fun generateCertificate(keygenAlgorithm: Algorithm): Promise<RTCCertificate>
        fun generateCertificate(keygenAlgorithm: String): Promise<RTCCertificate>
    }
}
