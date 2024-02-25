// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.storage

import web.events.EventTarget
import web.events.EventType

inline fun StorageEvent(
    type: EventType<StorageEvent<*>>,
): StorageEvent<*> =
    StorageEvent<EventTarget?>(
        type = type,
    )

inline fun StorageEvent(
    type: EventType<StorageEvent<*>>,
    init: StorageEventInit,
): StorageEvent<*> =
    StorageEvent<EventTarget?>(
        type = type,
        init = init,
    )
