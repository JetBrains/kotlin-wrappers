// Automatically generated - do not modify!

package webrtc

external class RTCPeerConnection : org.w3c.dom.events.EventTarget {
/*
    createOffer(options?: RTCOfferOptions): Promise<RTCSessionDescriptionInit>;
    createAnswer(options?: RTCAnswerOptions): Promise<RTCSessionDescriptionInit>;

    setLocalDescription(description: RTCSessionDescriptionInit): Promise<void>;
    readonly localDescription: RTCSessionDescription | null;
    readonly currentLocalDescription: RTCSessionDescription | null;
    readonly pendingLocalDescription: RTCSessionDescription | null;

    setRemoteDescription(description: RTCSessionDescriptionInit): Promise<void>;
    readonly remoteDescription: RTCSessionDescription | null;
    readonly currentRemoteDescription: RTCSessionDescription | null;
    readonly pendingRemoteDescription: RTCSessionDescription | null;

    addIceCandidate(candidate?: RTCIceCandidateInit | RTCIceCandidate): Promise<void>;

    readonly signalingState: RTCSignalingState;
    readonly connectionState: RTCPeerConnectionState;

    getConfiguration(): RTCConfiguration;
    setConfiguration(configuration: RTCConfiguration): void;
    close(): void;

    onicecandidateerror: PeerConnectionEventHandler<Event>;
    onconnectionstatechange: PeerConnectionEventHandler<Event>;

    // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions
    getSenders(): RTCRtpSender[];
    getReceivers(): RTCRtpReceiver[];
    getTransceivers(): RTCRtpTransceiver[];
    addTrack(track: MediaStreamTrack, ...streams: MediaStream[]): RTCRtpSender;
    removeTrack(sender: RTCRtpSender): void;
    addTransceiver(trackOrKind: MediaStreamTrack | string, init?: RTCRtpTransceiverInit): RTCRtpTransceiver;
    ontrack: PeerConnectionEventHandler<RTCTrackEvent>;

    // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-1
    readonly sctp: RTCSctpTransport | null;
    createDataChannel(label: string | null, dataChannelDict?: RTCDataChannelInit): RTCDataChannel;
    ondatachannel: PeerConnectionEventHandler<RTCDataChannelEvent>;

    // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-2
    getStats(selector?: MediaStreamTrack | null): Promise<RTCStatsReport>;

    // Extension: https://www.w3.org/TR/webrtc/#legacy-interface-extensions
    // Deprecated!
    createOffer(successCallback: RTCSessionDescriptionCallback,
        failureCallback: RTCPeerConnectionErrorCallback,
        options?: RTCOfferOptions): Promise<void>;
    setLocalDescription(description: RTCSessionDescriptionInit,
        successCallback: () => void,
        failureCallback: RTCPeerConnectionErrorCallback): Promise<void>;
    createAnswer(successCallback: RTCSessionDescriptionCallback,
        failureCallback: RTCPeerConnectionErrorCallback): Promise<void>;
    setRemoteDescription(description: RTCSessionDescriptionInit,
        successCallback: () => void,
        failureCallback: RTCPeerConnectionErrorCallback): Promise<void>;
    addIceCandidate(candidate: RTCIceCandidateInit | RTCIceCandidate,
        successCallback: () => void,
        failureCallback: RTCPeerConnectionErrorCallback): Promise<void>;
    getStats(selector: MediaStreamTrack | null,
        successCallback: (report: RTCStatsReport) => void,
        failureCallback: RTCPeerConnectionErrorCallback): Promise<void>;
*/
}
