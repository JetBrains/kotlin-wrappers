// Automatically generated - do not modify!

package web.payment

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PaymentMethodChangeEventTypes :
    PaymentMethodChangeEventTypes_deprecated {

    @JsValue("paymentmethodchange")
    fun <C : EventTarget> paymentMethodChange(): EventType<PaymentMethodChangeEvent<C>>
}
