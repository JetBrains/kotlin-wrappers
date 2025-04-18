// Automatically generated - do not modify!

package web.payment

import js.promise.PromiseLike
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`PaymentRequestUpdateEvent`** interface is used for events sent to a PaymentRequest instance when changes are made to shipping-related information for a pending PaymentRequest.
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
