// Automatically generated - do not modify!

package webrtc

import kotlinx.js.ReadonlyArray

sealed external interface RTCCertificate {
    val expires: EpochTimeStamp
    fun getFingerprints(): ReadonlyArray<RTCDtlsFingerprint>
}
