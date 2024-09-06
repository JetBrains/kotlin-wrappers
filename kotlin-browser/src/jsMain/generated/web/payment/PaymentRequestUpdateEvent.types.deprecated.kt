// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventType

sealed external class PaymentRequestUpdateEventTypes_deprecated {

    @JsValue("payerdetailchange")
    fun payerDetailChange(): EventType<PaymentRequestUpdateEvent>

    @JsValue("shippingaddresschange")
    fun shippingAddressChange(): EventType<PaymentRequestUpdateEvent>

    @JsValue("shippingoptionchange")
    fun shippingOptionChange(): EventType<PaymentRequestUpdateEvent>
}
