// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCSdpType

inline val RTCSdpType.Companion.answer: RTCSdpType
    get() = unsafeCast("answer")

inline val RTCSdpType.Companion.offer: RTCSdpType
    get() = unsafeCast("offer")

inline val RTCSdpType.Companion.pranswer: RTCSdpType
    get() = unsafeCast("pranswer")

inline val RTCSdpType.Companion.rollback: RTCSdpType
    get() = unsafeCast("rollback")
