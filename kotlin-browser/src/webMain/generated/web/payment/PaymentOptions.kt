// Automatically generated - do not modify!

package web.payment

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/PaymentRequest#options)
 */
@JsPlainObject
external interface PaymentOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/PaymentRequest#requestpayeremail)
     */
    var requestPayerEmail: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/PaymentRequest#requestpayername)
     */
    var requestPayerName: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/PaymentRequest#requestpayerphone)
     */
    var requestPayerPhone: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/PaymentRequest#requestshipping)
     */
    var requestShipping: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/PaymentRequest#shippingtype)
     */
    var shippingType: PaymentShippingType?
}
