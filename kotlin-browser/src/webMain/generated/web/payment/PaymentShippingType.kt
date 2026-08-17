// Automatically generated - do not modify!

package web.payment

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PaymentShippingType

inline val PaymentShippingType.Companion.delivery: PaymentShippingType
    get() = unsafeCast("delivery")

inline val PaymentShippingType.Companion.pickup: PaymentShippingType
    get() = unsafeCast("pickup")

inline val PaymentShippingType.Companion.shipping: PaymentShippingType
    get() = unsafeCast("shipping")
