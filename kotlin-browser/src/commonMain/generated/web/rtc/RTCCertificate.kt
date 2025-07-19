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
open external class RTCCertificate
private constructor() :
    Serializable {
    /**
     * The read-only **`expires`** property of the RTCCertificate interface returns the expiration date of the certificate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/expires)
     */
    val expires: EpochTimeStamp

    /**
     * The **`getFingerprints()`** method of the **RTCCertificate** interface is used to get an array of certificate fingerprints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/getFingerprints)
     */
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
