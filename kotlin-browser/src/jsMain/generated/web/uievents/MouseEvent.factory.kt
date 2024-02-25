// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun MouseEvent(
    type: EventType<MouseEvent<*>>,
): MouseEvent<*> =
    MouseEvent<EventTarget?>(
        type = type,
    )

inline fun MouseEvent(
    type: EventType<MouseEvent<*>>,
    init: MouseEventInit,
): MouseEvent<*> =
    MouseEvent<EventTarget?>(
        type = type,
        init = init,
    )
