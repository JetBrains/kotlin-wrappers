// Automatically generated - do not modify!

package web.payment

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerdetailchange_event)
 */
inline val <C : PaymentResponse> C.payerDetailChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, PaymentRequestUpdateEvent.payerDetailChange())
