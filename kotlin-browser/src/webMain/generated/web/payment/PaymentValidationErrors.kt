// Automatically generated - do not modify!

package web.payment

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry#errorfields)
 */
@JsPlainObject
external interface PaymentValidationErrors {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry#error)
     */
    var error: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry#payer)
     */
    var payer: PayerErrors?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry#shippingAddress)
     */
    var shippingAddress: AddressErrors?
}
