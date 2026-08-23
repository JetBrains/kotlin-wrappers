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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#bundlepolicy)
     */
    var bundlePolicy: RTCBundlePolicy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#certificates)
     */
    var certificates: ReadonlyArray<RTCCertificate>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#icecandidatepoolsize)
     */
    var iceCandidatePoolSize: Short /* unsigned byte */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#iceservers)
     */
    var iceServers: ReadonlyArray<RTCIceServer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#icetransportpolicy)
     */
    var iceTransportPolicy: RTCIceTransportPolicy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/setConfiguration#rtcpmuxpolicy)
     */
    var rtcpMuxPolicy: RTCRtcpMuxPolicy?
}
