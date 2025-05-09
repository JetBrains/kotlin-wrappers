// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.serialization.Serializable
import web.time.EpochTimeStamp

/**
 * The **`RTCCertificate`** interface of the WebRTC API provides an object representing a certificate that an RTCPeerConnection uses to authenticate.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate)
 */
external class RTCCertificate
private constructor() :
    Serializable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/expires)
     */
    val expires: EpochTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/getFingerprints)
     */
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
