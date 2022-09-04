// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCRtpReceiver {
    //readonly track?: MediaStreamTrack;
    //readonly transport?: RTCDtlsTransport;
    //readonly rtcpTransport?: RTCDtlsTransport;
    fun getParameters(): RTCRtpParameters
    fun getContributingSources(): ReadonlyArray<RTCRtpContributingSource>
}
