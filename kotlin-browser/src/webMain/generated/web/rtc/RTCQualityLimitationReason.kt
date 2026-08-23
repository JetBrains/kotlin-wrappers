// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason)
 */
@JsUnion
sealed /* union */
external interface RTCQualityLimitationReason

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason#bandwidth)
 */
inline val RTCQualityLimitationReason.Companion.bandwidth: RTCQualityLimitationReason
    get() = unsafeCast("bandwidth")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason#cpu)
 */
inline val RTCQualityLimitationReason.Companion.cpu: RTCQualityLimitationReason
    get() = unsafeCast("cpu")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason#none)
 */
inline val RTCQualityLimitationReason.Companion.none: RTCQualityLimitationReason
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCOutboundRtpStreamStats/qualityLimitationReason#other)
 */
inline val RTCQualityLimitationReason.Companion.other: RTCQualityLimitationReason
    get() = unsafeCast("other")
