// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.payment

import js.reflect.unsafeCast

sealed external interface PaymentComplete {
    companion object
}

inline val PaymentComplete.Companion.fail: PaymentComplete
    get() = unsafeCast("fail")

inline val PaymentComplete.Companion.success: PaymentComplete
    get() = unsafeCast("success")

inline val PaymentComplete.Companion.unknown: PaymentComplete
    get() = unsafeCast("unknown")
