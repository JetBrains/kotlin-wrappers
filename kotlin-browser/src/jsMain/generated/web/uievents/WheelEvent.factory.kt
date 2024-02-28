// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun WheelEvent(
    type: EventType<WheelEvent<EventTarget?>>,
): WheelEvent<*> =
    WheelEvent<EventTarget?>(
        type = type,
    )

inline fun WheelEvent(
    type: EventType<WheelEvent<EventTarget?>>,
    init: WheelEventInit,
): WheelEvent<*> =
    WheelEvent<EventTarget?>(
        type = type,
        init = init,
    )
