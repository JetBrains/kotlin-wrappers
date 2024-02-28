// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun FocusEvent(
    type: EventType<FocusEvent<EventTarget>>,
): FocusEvent<*> =
    FocusEvent<EventTarget?>(
        type = type,
    )

inline fun FocusEvent(
    type: EventType<FocusEvent<EventTarget>>,
    init: FocusEventInit,
): FocusEvent<*> =
    FocusEvent<EventTarget?>(
        type = type,
        init = init,
    )
