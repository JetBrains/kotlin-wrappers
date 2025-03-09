// Automatically generated - do not modify!

package web.payment

import js.objects.JsPlainObject

@JsPlainObject
external interface PaymentDetailsUpdate :
    PaymentDetailsBase {
    val error: String?
    val paymentMethodErrors: Any?
    val shippingAddressErrors: AddressErrors?
    val total: PaymentItem?
}
