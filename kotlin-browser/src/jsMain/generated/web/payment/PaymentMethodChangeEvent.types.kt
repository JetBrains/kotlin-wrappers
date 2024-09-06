// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventType

sealed external class PaymentMethodChangeEventTypes :
    PaymentMethodChangeEventTypes_deprecated {

    @JsValue("paymentmethodchange")
    val PAYMENT_METHOD_CHANGE: EventType<PaymentMethodChangeEvent>
}
