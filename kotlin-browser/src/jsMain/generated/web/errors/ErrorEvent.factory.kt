// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.errors

import web.events.EventTarget
import web.events.EventType

inline fun ErrorEvent(
    type: EventType<ErrorEvent<*>>,
): ErrorEvent<*> =
    ErrorEvent<EventTarget?>(
        type = type,
    )

inline fun ErrorEvent(
    type: EventType<ErrorEvent<*>>,
    init: ErrorEventInit,
): ErrorEvent<*> =
    ErrorEvent<EventTarget?>(
        type = type,
        init = init,
    )
