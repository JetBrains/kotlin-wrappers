// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.assembly

import js.reflect.unsafeCast

sealed external interface AddressType {
    companion object
}

inline val AddressType.Companion.i32: AddressType
    get() = unsafeCast("i32")

inline val AddressType.Companion.i64: AddressType
    get() = unsafeCast("i64")
