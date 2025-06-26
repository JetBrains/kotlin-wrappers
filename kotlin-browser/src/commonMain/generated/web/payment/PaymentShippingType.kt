// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.payment

import js.reflect.unsafeCast

sealed external interface PaymentShippingType {
    companion object
}

inline val PaymentShippingType.Companion.delivery: PaymentShippingType
    get() = unsafeCast("delivery")

inline val PaymentShippingType.Companion.pickup: PaymentShippingType
    get() = unsafeCast("pickup")

inline val PaymentShippingType.Companion.shipping: PaymentShippingType
    get() = unsafeCast("shipping")
