// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.payment

import web.events.Event
import web.events.EventTarget
import web.events.EventType

inline fun <C : EventTarget> Event.Companion.payerDetailChange(): EventType<Event, C> =
    EventType("payerdetailchange")

inline fun <C : EventTarget> Event.Companion.shippingAddressChange(): EventType<Event, C> =
    EventType("shippingaddresschange")

inline fun <C : EventTarget> Event.Companion.shippingOptionChange(): EventType<Event, C> =
    EventType("shippingoptionchange")
