// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import web.events.Event
import web.events.EventInit
import web.events.EventType
import kotlin.js.Promise

/**
 * This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent)
 */
external interface PaymentRequestUpdateEventInit : EventInit

open external class PaymentRequestUpdateEvent(
    override val type: EventType<PaymentRequestUpdateEvent>,
    init: PaymentRequestUpdateEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent/updateWith) */
    fun updateWith(detailsPromise: PaymentDetailsUpdate)
    fun updateWith(detailsPromise: Promise<PaymentDetailsUpdate> /* PromiseLike */)

    companion object
}
