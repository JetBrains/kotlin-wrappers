// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray
import kotlinx.js.Void
import media.stream.MediaStream
import media.stream.MediaStreamTrack
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

external class RTCPeerConnection(
    configuration: RTCConfiguration = definedExternally,
) : EventTarget {
    val canTrickleIceCandidates: Boolean?
    val connectionState: RTCPeerConnectionState
    val currentLocalDescription: RTCSessionDescription?
    val currentRemoteDescription: RTCSessionDescription?
    val iceConnectionState: RTCIceConnectionState
    val iceGatheringState: RTCIceGatheringState
    val localDescription: RTCSessionDescription?
    var onconnectionstatechange: EventHandler<Event>?
    var ondatachannel: EventHandler<RTCDataChannelEvent>?
    var onicecandidate: EventHandler<RTCPeerConnectionIceEvent>?
    var onicecandidateerror: EventHandler<Event>?
    var oniceconnectionstatechange: EventHandler<Event>?
    var onicegatheringstatechange: EventHandler<Event>?
    var onnegotiationneeded: EventHandler<Event>?
    var onsignalingstatechange: EventHandler<Event>?
    var ontrack: EventHandler<RTCTrackEvent>?
    val pendingLocalDescription: RTCSessionDescription?
    val pendingRemoteDescription: RTCSessionDescription?
    val remoteDescription: RTCSessionDescription?
    val sctp: RTCSctpTransport?
    val signalingState: RTCSignalingState
    fun addIceCandidate(candidate: RTCIceCandidateInit = definedExternally): Promise<Void>
    fun addTrack(
        track: MediaStreamTrack,
        vararg streams: MediaStream,
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
    fun createAnswer(options: RTCAnswerOptions = definedExternally): Promise<RTCSessionDescriptionInit>
    fun createDataChannel(
        label: String,
        dataChannelDict: RTCDataChannelInit = definedExternally,
    ): RTCDataChannel

    fun createOffer(options: RTCOfferOptions = definedExternally): Promise<RTCSessionDescriptionInit>
    fun getConfiguration(): RTCConfiguration
    fun getReceivers(): ReadonlyArray<RTCRtpReceiver>
    fun getSenders(): ReadonlyArray<RTCRtpSender>
    fun getStats(selector: MediaStreamTrack? = definedExternally): Promise<RTCStatsReport>
    fun getTransceivers(): ReadonlyArray<RTCRtpTransceiver>
    fun removeTrack(sender: RTCRtpSender)
    fun restartIce()
    fun setConfiguration(configuration: RTCConfiguration = definedExternally)
    fun setLocalDescription(description: RTCLocalSessionDescriptionInit = definedExternally): Promise<Void>
    fun setRemoteDescription(description: RTCSessionDescriptionInit): Promise<Void>
}
