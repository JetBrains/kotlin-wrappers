// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PaymentRequestUpdateEventTypes {

    @JsValue("payerdetailchange")
    fun <C : EventTarget> payerDetailChange(): EventType<PaymentRequestUpdateEvent, C>

    @JsValue("shippingaddresschange")
    fun <C : EventTarget> shippingAddressChange(): EventType<PaymentRequestUpdateEvent, C>

    @JsValue("shippingoptionchange")
    fun <C : EventTarget> shippingOptionChange(): EventType<PaymentRequestUpdateEvent, C>
}
