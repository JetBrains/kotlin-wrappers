// Automatically generated - do not modify!

package web.payment

import js.core.JsAny
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`PaymentMethodChangeEvent`** interface of the Payment Request API describes the PaymentRequest/paymentmethodchange_event event which is fired by some payment handlers when the user switches payment instruments (e.g., a user selects a 'store' card to make a purchase while using Apple Pay).
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent)
 */
open external class PaymentMethodChangeEvent(
    override val type: EventType<PaymentMethodChangeEvent>,
    init: PaymentMethodChangeEventInit = definedExternally,
) : PaymentRequestUpdateEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/methodDetails)
     */
    val methodDetails: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/methodName)
     */
    val methodName: String

    @JsAlias(THIS)
    override fun asInit(): PaymentMethodChangeEventInit

    companion object {
        @JsValue("paymentmethodchange")
        val PAYMENT_METHOD_CHANGE: EventType<PaymentMethodChangeEvent>
    }
}
