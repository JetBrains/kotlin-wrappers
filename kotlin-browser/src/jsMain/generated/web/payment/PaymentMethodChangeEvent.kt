// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import web.events.EventType

external interface PaymentMethodChangeEventInit : PaymentRequestUpdateEventInit {
    var methodDetails: Any?
    var methodName: String?
}

open external class PaymentMethodChangeEvent(
    override val type: EventType<PaymentMethodChangeEvent>,
    init: PaymentMethodChangeEventInit = definedExternally,
) : PaymentRequestUpdateEvent {
    val methodDetails: Any?
    val methodName: String

    companion object
}
