// Automatically generated - do not modify!

package web.payment

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingType)
 */
@JsUnion
sealed /* union */
external interface PaymentShippingType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingType#delivery)
 */
inline val PaymentShippingType.Companion.delivery: PaymentShippingType
    get() = unsafeCast("delivery")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingType#pickup)
 */
inline val PaymentShippingType.Companion.pickup: PaymentShippingType
    get() = unsafeCast("pickup")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingType#shipping)
 */
inline val PaymentShippingType.Companion.shipping: PaymentShippingType
    get() = unsafeCast("shipping")
