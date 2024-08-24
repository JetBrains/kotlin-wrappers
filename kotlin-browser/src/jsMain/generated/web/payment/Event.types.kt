// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.payment

import web.events.Event
import web.events.EventType

inline fun Event.Companion.payerDetailChange(): EventType<Event> =
    EventType("payerdetailchange")

inline fun Event.Companion.shippingAddressChange(): EventType<Event> =
    EventType("shippingaddresschange")

inline fun Event.Companion.shippingOptionChange(): EventType<Event> =
    EventType("shippingoptionchange")
