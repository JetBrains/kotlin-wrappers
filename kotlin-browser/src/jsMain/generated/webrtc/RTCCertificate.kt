// Automatically generated - do not modify!

package webrtc

import js.core.EpochTimeStamp
import js.core.ReadonlyArray

sealed external class RTCCertificate {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/expires) */
    val expires: EpochTimeStamp

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCCertificate/getFingerprints) */
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
