// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.payment

import web.events.EventTarget
import web.events.EventType

inline fun PaymentRequestUpdateEvent(
    type: EventType<PaymentRequestUpdateEvent<EventTarget>>,
): PaymentRequestUpdateEvent<*> =
    PaymentRequestUpdateEvent<EventTarget?>(
        type = type,
    )

inline fun PaymentRequestUpdateEvent(
    type: EventType<PaymentRequestUpdateEvent<EventTarget>>,
    init: PaymentRequestUpdateEventInit,
): PaymentRequestUpdateEvent<*> =
    PaymentRequestUpdateEvent<EventTarget?>(
        type = type,
        init = init,
    )
