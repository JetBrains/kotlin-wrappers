// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.payment

import web.events.EventTarget
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent)
 */
open external class PaymentMethodChangeEvent<out C : EventTarget?>(
    override val type: EventType<PaymentMethodChangeEvent<EventTarget>>,
    init: PaymentMethodChangeEventInit = definedExternally,
) : PaymentRequestUpdateEvent<C>,
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
