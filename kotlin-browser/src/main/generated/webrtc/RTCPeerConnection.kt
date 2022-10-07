// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import media.stream.MediaStream
import media.stream.MediaStreamTrack
import web.events.Event

external class RTCPeerConnection(
    configuration: RTCConfiguration = definedExternally,
    options: Any = definedExternally,
) : web.events.EventTarget {
    val canTrickleIceCandidates: Boolean?
    val connectionState: RTCPeerConnectionState
    val currentLocalDescription: RTCSessionDescription?
    val currentRemoteDescription: RTCSessionDescription?
    val iceConnectionState: RTCIceConnectionState
    val iceGatheringState: RTCIceGatheringState
    val localDescription: RTCSessionDescription?
    var onconnectionstatechange: ((event: Event) -> Unit)?
    var ondatachannel: ((event: RTCDataChannelEvent) -> Unit)?
    var onicecandidate: ((event: RTCPeerConnectionIceEvent) -> Unit)?
    var onicecandidateerror: ((event: Event) -> Unit)?
    var oniceconnectionstatechange: ((event: Event) -> Unit)?
    var onicegatheringstatechange: ((event: Event) -> Unit)?
    var onnegotiationneeded: ((event: Event) -> Unit)?
    var onsignalingstatechange: ((event: Event) -> Unit)?
    var ontrack: ((event: RTCTrackEvent) -> Unit)?
    val pendingLocalDescription: RTCSessionDescription?
    val pendingRemoteDescription: RTCSessionDescription?
    val remoteDescription: RTCSessionDescription?
    val sctp: RTCSctpTransport?
    val signalingState: RTCSignalingState
    fun addIceCandidate(candidate: RTCIceCandidateInit = definedExternally): kotlin.js.Promise<Unit>

    /** @deprecated */
    fun addIceCandidate(
        candidate: RTCIceCandidateInit,
        successCallback: VoidFunction,
        failureCallback: RTCPeerConnectionErrorCallback,
    ): kotlin.js.Promise<Unit>

    fun addTrack(
        track: MediaStreamTrack,
        vararg streams: ReadonlyArray<MediaStream>,
    ): RTCRtpSender

    fun addTransceiver(
        trackOrKind: MediaStreamTrack,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    fun addTransceiver(
        trackOrKind: String,
        init: RTCRtpTransceiverInit = definedExternally,
    ): RTCRtpTransceiver

    fun close()
    fun createAnswer(options: RTCAnswerOptions = definedExternally): kotlin.js.Promise<RTCSessionDescriptionInit>

    /** @deprecated */
    fun createAnswer(
        successCallback: RTCSessionDescriptionCallback,
        failureCallback: RTCPeerConnectionErrorCallback,
    ): kotlin.js.Promise<Unit>

    fun createDataChannel(
        label: String,
        dataChannelDict: RTCDataChannelInit = definedExternally,
    ): RTCDataChannel

    fun createOffer(options: RTCOfferOptions = definedExternally): kotlin.js.Promise<RTCSessionDescriptionInit>

    /** @deprecated */
    fun createOffer(
        successCallback: RTCSessionDescriptionCallback,
        failureCallback: RTCPeerConnectionErrorCallback,
        options: RTCOfferOptions = definedExternally,
    ): kotlin.js.Promise<Unit>

    fun getConfiguration(): RTCConfiguration
    fun getReceivers(): ReadonlyArray<RTCRtpReceiver>
    fun getSenders(): ReadonlyArray<RTCRtpSender>
    fun getStats(selector: MediaStreamTrack? = definedExternally): kotlin.js.Promise<RTCStatsReport>
    fun getTransceivers(): ReadonlyArray<RTCRtpTransceiver>
    fun removeTrack(sender: RTCRtpSender)
    fun restartIce()
    fun setConfiguration(configuration: RTCConfiguration = definedExternally)
    fun setLocalDescription(description: RTCLocalSessionDescriptionInit = definedExternally): kotlin.js.Promise<Unit>

    /** @deprecated */
    fun setLocalDescription(
        description: RTCLocalSessionDescriptionInit,
        successCallback: VoidFunction,
        failureCallback: RTCPeerConnectionErrorCallback,
    ): kotlin.js.Promise<Unit>

    fun setRemoteDescription(description: RTCSessionDescriptionInit): kotlin.js.Promise<Unit>

    /** @deprecated */
    fun setRemoteDescription(
        description: RTCSessionDescriptionInit,
        successCallback: VoidFunction,
        failureCallback: RTCPeerConnectionErrorCallback,
    ): kotlin.js.Promise<Unit>
    // addEventListener<K extends keyof RTCPeerConnectionEventMap>(type: K, listener: (this: RTCPeerConnection, ev: RTCPeerConnectionEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void
    // addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void
    // removeEventListener<K extends keyof RTCPeerConnectionEventMap>(type: K, listener: (this: RTCPeerConnection, ev: RTCPeerConnectionEventMap[K]) => any, options?: boolean | EventListenerOptions): void
    // removeEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | EventListenerOptions): void

    companion object {
        val defaultIceServers: ReadonlyArray<RTCIceServer>

        // Extension: https://www.w3.org/TR/webrtc/#sec.cert-mgmt
        fun generateCertificate(
            keygenAlgorithm: String, /* AlgorithmIdentifier */
        ): kotlin.js.Promise<RTCCertificate>
    }
}
