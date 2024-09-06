// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventType

sealed external class PaymentRequestUpdateEventTypes :
    PaymentRequestUpdateEventTypes_deprecated {

    @JsValue("payerdetailchange")
    val PAYER_DETAIL_CHANGE: EventType<PaymentRequestUpdateEvent>

    @JsValue("shippingaddresschange")
    val SHIPPING_ADDRESS_CHANGE: EventType<PaymentRequestUpdateEvent>

    @JsValue("shippingoptionchange")
    val SHIPPING_OPTION_CHANGE: EventType<PaymentRequestUpdateEvent>
}
