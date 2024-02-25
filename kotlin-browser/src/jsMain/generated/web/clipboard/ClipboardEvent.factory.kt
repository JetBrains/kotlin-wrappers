// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.clipboard

import web.events.EventTarget
import web.events.EventType

inline fun ClipboardEvent(
    type: EventType<ClipboardEvent<*>>,
): ClipboardEvent<*> =
    ClipboardEvent<EventTarget?>(
        type = type,
    )

inline fun ClipboardEvent(
    type: EventType<ClipboardEvent<*>>,
    init: ClipboardEventInit,
): ClipboardEvent<*> =
    ClipboardEvent<EventTarget?>(
        type = type,
        init = init,
    )
