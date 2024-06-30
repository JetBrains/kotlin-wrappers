// Automatically generated - do not modify!

package web.payment

import web.events.EventInstance
import web.events.EventType

inline val <C : PaymentRequest> C.paymentMethodChangeEvent: EventInstance<PaymentMethodChangeEvent, C, C>
    get() = EventInstance(this, EventType("paymentmethodchange"))
