// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun ToggleEvent(
    type: EventType<ToggleEvent<EventTarget?>>,
): ToggleEvent<*> =
    ToggleEvent<EventTarget?>(
        type = type,
    )

inline fun ToggleEvent(
    type: EventType<ToggleEvent<EventTarget?>>,
    init: ToggleEventInit,
): ToggleEvent<*> =
    ToggleEvent<EventTarget?>(
        type = type,
        init = init,
    )
