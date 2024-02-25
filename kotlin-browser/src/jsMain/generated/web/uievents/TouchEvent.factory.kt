// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun TouchEvent(
    type: EventType<TouchEvent<*>>,
): TouchEvent<*> =
    TouchEvent<EventTarget?>(
        type = type,
    )

inline fun TouchEvent(
    type: EventType<TouchEvent<*>>,
    init: TouchEventInit,
): TouchEvent<*> =
    TouchEvent<EventTarget?>(
        type = type,
        init = init,
    )
