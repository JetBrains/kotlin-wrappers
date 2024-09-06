// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventType

sealed external class PaymentMethodChangeEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PaymentMethodChangeEvent.PAYMENT_METHOD_CHANGE"),
    )
    @JsValue("paymentmethodchange")
    fun paymentMethodChange(): EventType<PaymentMethodChangeEvent>
}
