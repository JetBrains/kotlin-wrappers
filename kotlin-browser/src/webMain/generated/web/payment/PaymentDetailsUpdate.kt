// Automatically generated - do not modify!

package web.payment

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface PaymentDetailsUpdate :
    PaymentDetailsBase {
    var error: String?
    var paymentMethodErrors: JsAny?
    var shippingAddressErrors: AddressErrors?
    var total: PaymentItem?
}
