// Automatically generated - do not modify!

package web.payment

import js.promise.PromiseLike
import js.reflect.unsafeCast
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
     * The **`updateWith()`** method of the ```js-nolint updateWith(details) ``` - `details` - : Either an object or a Promise that resolves to an object, specifying the changes applied to the payment request: - `displayItems` MISSING: optional_inline] - : An array of objects, each describing one line item for the payment request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent/updateWith)
     */
    fun updateWith(detailsPromise: PaymentDetailsUpdate)
    fun updateWith(detailsPromise: PromiseLike<PaymentDetailsUpdate>)

    companion object
}

inline fun PaymentRequestUpdateEvent.asInit(): PaymentRequestUpdateEventInit =
    unsafeCast(this)

inline val PaymentRequestUpdateEvent.Companion.PAYER_DETAIL_CHANGE: EventType<PaymentRequestUpdateEvent>
    get() = EventType("payerdetailchange")

inline val PaymentRequestUpdateEvent.Companion.SHIPPING_ADDRESS_CHANGE: EventType<PaymentRequestUpdateEvent>
    get() = EventType("shippingaddresschange")

inline val PaymentRequestUpdateEvent.Companion.SHIPPING_OPTION_CHANGE: EventType<PaymentRequestUpdateEvent>
    get() = EventType("shippingoptionchange")
