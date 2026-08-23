// Automatically generated - do not modify!

package web.rtc

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats)
 */
@JsPlainObject
external interface RTCIceCandidatePairStats :
    RTCStats {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/availableIncomingBitrate)
     */
    var availableIncomingBitrate: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/availableOutgoingBitrate)
     */
    var availableOutgoingBitrate: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/bytesDiscardedOnSend)
     */
    var bytesDiscardedOnSend: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/bytesReceived)
     */
    var bytesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/bytesSent)
     */
    var bytesSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/consentRequestsSent)
     */
    var consentRequestsSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/currentRoundTripTime)
     */
    var currentRoundTripTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/lastPacketReceivedTimestamp)
     */
    var lastPacketReceivedTimestamp: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/lastPacketSentTimestamp)
     */
    var lastPacketSentTimestamp: DOMHighResTimeStamp?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/localCandidateId)
     */
    var localCandidateId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/nominated)
     */
    var nominated: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/packetsDiscardedOnSend)
     */
    var packetsDiscardedOnSend: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/packetsReceived)
     */
    var packetsReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/packetsSent)
     */
    var packetsSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/remoteCandidateId)
     */
    var remoteCandidateId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/requestsReceived)
     */
    var requestsReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/requestsSent)
     */
    var requestsSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/responsesReceived)
     */
    var responsesReceived: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/responsesSent)
     */
    var responsesSent: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/state)
     */
    var state: RTCStatsIceCandidatePairState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/totalRoundTripTime)
     */
    var totalRoundTripTime: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceCandidatePairStats/transportId)
     */
    var transportId: String
}
