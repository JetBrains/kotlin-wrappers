// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.sockets

import web.events.EventTarget
import web.events.EventType

inline fun CloseEvent(
    type: EventType<CloseEvent<*>>,
): CloseEvent<*> =
    CloseEvent<EventTarget?>(
        type = type,
    )

inline fun CloseEvent(
    type: EventType<CloseEvent<*>>,
    init: CloseEventInit,
): CloseEvent<*> =
    CloseEvent<EventTarget?>(
        type = type,
        init = init,
    )
