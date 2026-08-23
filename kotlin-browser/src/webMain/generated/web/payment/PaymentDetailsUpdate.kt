// Automatically generated - do not modify!

package web.payment

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show#detailspromise)
 */
@JsPlainObject
external interface PaymentDetailsUpdate :
    PaymentDetailsBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show#error)
     */
    var error: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show#paymentmethoderrors)
     */
    var paymentMethodErrors: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show#shippingaddresserrors)
     */
    var shippingAddressErrors: AddressErrors?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show#total)
     */
    var total: PaymentItem?
}
