// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.history

import web.events.EventTarget
import web.events.EventType

inline fun HashChangeEvent(
    type: EventType<HashChangeEvent<*>>,
): HashChangeEvent<*> =
    HashChangeEvent<EventTarget?>(
        type = type,
    )

inline fun HashChangeEvent(
    type: EventType<HashChangeEvent<*>>,
    init: HashChangeEventInit,
): HashChangeEvent<*> =
    HashChangeEvent<EventTarget?>(
        type = type,
        init = init,
    )
