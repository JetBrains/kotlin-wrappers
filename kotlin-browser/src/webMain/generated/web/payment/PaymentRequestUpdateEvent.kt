// Automatically generated - do not modify!

package web.payment

import js.promise.PromiseLike
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
     * The **`updateWith()`** method of the PaymentRequestUpdateEvent interface updates the details of an existing PaymentRequest.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent/updateWith)
     */
    fun updateWith(detailsPromise: PaymentDetailsUpdate)
    fun updateWith(detailsPromise: PromiseLike<PaymentDetailsUpdate>)

    companion object
}

inline val PaymentRequestUpdateEvent.Companion.PAYER_DETAIL_CHANGE: EventType<PaymentRequestUpdateEvent>
    get() = EventType("payerdetailchange")

inline val PaymentRequestUpdateEvent.Companion.SHIPPING_ADDRESS_CHANGE: EventType<PaymentRequestUpdateEvent>
    get() = EventType("shippingaddresschange")

inline val PaymentRequestUpdateEvent.Companion.SHIPPING_OPTION_CHANGE: EventType<PaymentRequestUpdateEvent>
    get() = EventType("shippingoptionchange")
