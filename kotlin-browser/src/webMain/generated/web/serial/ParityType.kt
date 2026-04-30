// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serial

import js.reflect.unsafeCast

sealed external interface ParityType {
    companion object
}

inline val ParityType.Companion.even: ParityType
    get() = unsafeCast("even")

inline val ParityType.Companion.none: ParityType
    get() = unsafeCast("none")

inline val ParityType.Companion.odd: ParityType
    get() = unsafeCast("odd")
