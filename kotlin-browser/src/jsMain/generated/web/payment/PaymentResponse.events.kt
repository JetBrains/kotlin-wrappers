// Automatically generated - do not modify!

package web.payment

import web.events.EventInstance

inline val <C : PaymentResponse> C.payerDetailChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, PaymentRequestUpdateEvent.payerDetailChange())
