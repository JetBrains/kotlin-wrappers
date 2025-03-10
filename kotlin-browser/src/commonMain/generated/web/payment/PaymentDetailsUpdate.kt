// Automatically generated - do not modify!

package web.payment

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface PaymentDetailsUpdate :
    PaymentDetailsBase {
    val error: String?
    val paymentMethodErrors: JsAny?
    val shippingAddressErrors: AddressErrors?
    val total: PaymentItem?
}
