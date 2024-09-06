// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventType

sealed external class PaymentRequestUpdateEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PaymentRequestUpdateEvent.PAYER_DETAIL_CHANGE"),
    )
    @JsValue("payerdetailchange")
    fun payerDetailChange(): EventType<PaymentRequestUpdateEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PaymentRequestUpdateEvent.SHIPPING_ADDRESS_CHANGE"),
    )
    @JsValue("shippingaddresschange")
    fun shippingAddressChange(): EventType<PaymentRequestUpdateEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PaymentRequestUpdateEvent.SHIPPING_OPTION_CHANGE"),
    )
    @JsValue("shippingoptionchange")
    fun shippingOptionChange(): EventType<PaymentRequestUpdateEvent>
}
