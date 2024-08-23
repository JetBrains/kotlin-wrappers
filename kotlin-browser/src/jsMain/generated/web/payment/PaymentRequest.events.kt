// Automatically generated - do not modify!

package web.payment

import web.events.EventInstance

inline val <C : PaymentRequest> C.paymentMethodChangeEvent: EventInstance<PaymentMethodChangeEvent, C, C>
    get() = EventInstance(this, PaymentMethodChangeEvent.paymentMethodChange())

inline val <C : PaymentRequest> C.shippingAddressChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, PaymentRequestUpdateEvent.shippingAddressChange())

inline val <C : PaymentRequest> C.shippingOptionChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, PaymentRequestUpdateEvent.shippingOptionChange())
