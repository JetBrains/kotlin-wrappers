// Automatically generated - do not modify!

package web.rtc

import js.numbers.UInt53
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats)
 */
@JsPlainObject
external interface RTCTransportStats :
    RTCStats {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/bytesReceived)
     */
    var bytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/bytesSent)
     */
    var bytesSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsCipher)
     */
    var dtlsCipher: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsRole)
     */
    var dtlsRole: RTCDtlsRole?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/dtlsState)
     */
    var dtlsState: RTCDtlsTransportState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/iceLocalUsernameFragment)
     */
    var iceLocalUsernameFragment: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/iceRole)
     */
    var iceRole: RTCIceRole?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/iceState)
     */
    var iceState: RTCIceTransportState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/localCertificateId)
     */
    var localCertificateId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/packetsReceived)
     */
    var packetsReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/packetsSent)
     */
    var packetsSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/remoteCertificateId)
     */
    var remoteCertificateId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/selectedCandidatePairChanges)
     */
    var selectedCandidatePairChanges: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/selectedCandidatePairId)
     */
    var selectedCandidatePairId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/srtpCipher)
     */
    var srtpCipher: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransportStats/tlsVersion)
     */
    var tlsVersion: String?
}
