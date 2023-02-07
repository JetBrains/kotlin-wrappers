// Automatically generated - do not modify!

package webrtc

import js.core.EpochTimeStamp
import js.core.ReadonlyArray

sealed external class RTCCertificate {
    val expires: EpochTimeStamp
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
