// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PaymentMethodChangeEventTypes {

    @JsValue("paymentmethodchange")
    fun <C : EventTarget> paymentMethodChange(): EventType<PaymentMethodChangeEvent, C>
}
