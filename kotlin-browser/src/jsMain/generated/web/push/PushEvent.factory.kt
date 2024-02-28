// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.push

import web.events.EventTarget
import web.events.EventType

inline fun PushEvent(
    type: EventType<PushEvent<EventTarget>>,
): PushEvent<*> =
    PushEvent<EventTarget?>(
        type = type,
    )

inline fun PushEvent(
    type: EventType<PushEvent<EventTarget>>,
    init: PushEventInit,
): PushEvent<*> =
    PushEvent<EventTarget?>(
        type = type,
        init = init,
    )
