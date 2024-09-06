// Automatically generated - do not modify!

package web.payment

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event)
 */
inline val <C : PaymentRequest> C.paymentMethodChangeEvent: EventInstance<PaymentMethodChangeEvent, C, C>
    get() = EventInstance(this, PaymentMethodChangeEvent.PAYMENT_METHOD_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingaddresschange_event)
 */
inline val <C : PaymentRequest> C.shippingAddressChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, PaymentRequestUpdateEvent.SHIPPING_ADDRESS_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingoptionchange_event)
 */
inline val <C : PaymentRequest> C.shippingOptionChangeEvent: EventInstance<PaymentRequestUpdateEvent, C, C>
    get() = EventInstance(this, PaymentRequestUpdateEvent.SHIPPING_OPTION_CHANGE)
