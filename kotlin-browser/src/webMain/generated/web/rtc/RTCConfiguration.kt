// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#return_value)
 */
@JsPlainObject
external interface RTCConfiguration {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#bundlepolicy)
     */
    var bundlePolicy: RTCBundlePolicy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#certificates)
     */
    var certificates: ReadonlyArray<RTCCertificate>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#icecandidatepoolsize)
     */
    var iceCandidatePoolSize: Short /* unsigned byte */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#iceservers)
     */
    var iceServers: ReadonlyArray<RTCIceServer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#icetransportpolicy)
     */
    var iceTransportPolicy: RTCIceTransportPolicy?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/getConfiguration#rtcpmuxpolicy)
     */
    var rtcpMuxPolicy: RTCRtcpMuxPolicy?
}
