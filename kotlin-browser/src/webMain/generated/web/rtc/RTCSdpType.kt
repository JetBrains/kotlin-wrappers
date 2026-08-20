// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type)
 */
@JsUnion
sealed /* union */
external interface RTCSdpType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type#answer)
 */
inline val RTCSdpType.Companion.answer: RTCSdpType
    get() = unsafeCast("answer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type#offer)
 */
inline val RTCSdpType.Companion.offer: RTCSdpType
    get() = unsafeCast("offer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type#pranswer)
 */
inline val RTCSdpType.Companion.pranswer: RTCSdpType
    get() = unsafeCast("pranswer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCSessionDescription/type#rollback)
 */
inline val RTCSdpType.Companion.rollback: RTCSdpType
    get() = unsafeCast("rollback")
