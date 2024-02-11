// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent)
 */
open external class PaymentMethodChangeEvent(
    override val type: EventType<PaymentMethodChangeEvent>,
    init: PaymentMethodChangeEventInit = definedExternally,
) : PaymentRequestUpdateEvent,
    PaymentMethodChangeEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/methodDetails)
     */
    override val methodDetails: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/methodName)
     */
    override val methodName: String

    companion object : PaymentMethodChangeEventTypes
}
