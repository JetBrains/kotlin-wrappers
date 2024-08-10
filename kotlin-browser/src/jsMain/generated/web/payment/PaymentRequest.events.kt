// Automatically generated - do not modify!

package web.payment

import web.events.EventInstance

inline val <C : PaymentRequest> C.paymentMethodChangeEvent: EventInstance<PaymentMethodChangeEvent, C, C>
    get() = EventInstance(this, PaymentMethodChangeEvent.paymentMethodChange())
