// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import js.reflect.unsafeCast

sealed external interface Overflow {
    companion object
}

inline val Overflow.Companion.constrain: Overflow
    get() = unsafeCast("constrain")

inline val Overflow.Companion.reject: Overflow
    get() = unsafeCast("reject")
