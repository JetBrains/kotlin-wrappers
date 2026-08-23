// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#configuration)
 */
@JsPlainObject
external interface RTCConfiguration {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#bundlePolicy)
     */
    var bundlePolicy: RTCBundlePolicy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#certificates)
     */
    var certificates: ReadonlyArray<RTCCertificate>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#iceCandidatePoolSize)
     */
    var iceCandidatePoolSize: Short /* unsigned byte */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#iceServers)
     */
    var iceServers: ReadonlyArray<RTCIceServer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#iceTransportPolicy)
     */
    var iceTransportPolicy: RTCIceTransportPolicy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#rtcpMuxPolicy)
     */
    var rtcpMuxPolicy: RTCRtcpMuxPolicy?
}
