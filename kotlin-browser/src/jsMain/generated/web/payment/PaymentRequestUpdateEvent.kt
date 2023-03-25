// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import web.events.Event
import web.events.EventInit
import web.events.EventType
import kotlin.js.Promise

external interface PaymentRequestUpdateEventInit : EventInit

open external class PaymentRequestUpdateEvent(
    override val type: EventType<PaymentRequestUpdateEvent>,
    init: PaymentRequestUpdateEventInit = definedExternally,
) : Event {
    fun updateWith(detailsPromise: PaymentDetailsUpdate)
    fun updateWith(detailsPromise: Promise<PaymentDetailsUpdate> /* PromiseLike */)

    companion object
}
