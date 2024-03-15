// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import js.promise.PromiseLike
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent)
 */
open external class PaymentRequestUpdateEvent(
    override val type: EventType<PaymentRequestUpdateEvent, EventTarget>,
    init: PaymentRequestUpdateEventInit = definedExternally,
) : Event,
    PaymentRequestUpdateEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent/updateWith)
     */
    fun updateWith(detailsPromise: PaymentDetailsUpdate)
    fun updateWith(detailsPromise: PromiseLike<PaymentDetailsUpdate>)

    companion object
}
