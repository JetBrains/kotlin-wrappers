// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import web.time.EpochTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate)
 */
sealed external class RTCCertificate {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/expires)
     */
    val expires: EpochTimeStamp

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/getFingerprints)
     */
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
