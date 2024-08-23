// Automatically generated - do not modify!

package web.payment

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PaymentDetailsUpdate :
    PaymentDetailsBase {
    var error: String?
    var paymentMethodErrors: Any?
    var shippingAddressErrors: AddressErrors?
    var total: PaymentItem?
}
