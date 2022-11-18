// Automatically generated - do not modify!

package webrtc

import kotlinx.js.EpochTimeStamp
import kotlinx.js.ReadonlyArray

sealed external class RTCCertificate {
    val expires: EpochTimeStamp
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
