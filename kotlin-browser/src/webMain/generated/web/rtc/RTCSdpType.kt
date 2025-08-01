// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.rtc

import js.reflect.unsafeCast

sealed external interface RTCSdpType {
    companion object
}

inline val RTCSdpType.Companion.answer: RTCSdpType
    get() = unsafeCast("answer")

inline val RTCSdpType.Companion.offer: RTCSdpType
    get() = unsafeCast("offer")

inline val RTCSdpType.Companion.pranswer: RTCSdpType
    get() = unsafeCast("pranswer")

inline val RTCSdpType.Companion.rollback: RTCSdpType
    get() = unsafeCast("rollback")
