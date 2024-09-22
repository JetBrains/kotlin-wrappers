// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import js.promise.PromiseLike
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent)
 */
open external class PaymentRequestUpdateEvent(
    override val type: EventType<PaymentRequestUpdateEvent>,
    init: PaymentRequestUpdateEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent/updateWith)
     */
    fun updateWith(detailsPromise: PaymentDetailsUpdate)
    fun updateWith(detailsPromise: PromiseLike<PaymentDetailsUpdate>)

    @JsAlias(THIS)
    override fun asInit(): PaymentRequestUpdateEventInit

    companion object {
        @JsValue("payerdetailchange")
        val PAYER_DETAIL_CHANGE: EventType<PaymentRequestUpdateEvent>

        @JsValue("shippingaddresschange")
        val SHIPPING_ADDRESS_CHANGE: EventType<PaymentRequestUpdateEvent>

        @JsValue("shippingoptionchange")
        val SHIPPING_OPTION_CHANGE: EventType<PaymentRequestUpdateEvent>
    }
}
