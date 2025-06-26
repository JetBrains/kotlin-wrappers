// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFillAddressKind {
    companion object
}

inline val AutoFillAddressKind.Companion.billing: AutoFillAddressKind
    get() = unsafeCast("billing")

inline val AutoFillAddressKind.Companion.shipping: AutoFillAddressKind
    get() = unsafeCast("shipping")
