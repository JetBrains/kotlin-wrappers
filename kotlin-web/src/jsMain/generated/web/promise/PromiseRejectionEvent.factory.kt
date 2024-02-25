// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.promise

import web.events.EventTarget
import web.events.EventType

inline fun PromiseRejectionEvent(
    type: EventType<PromiseRejectionEvent<*>>,
    init: PromiseRejectionEventInit,
): PromiseRejectionEvent<*> =
    PromiseRejectionEvent<EventTarget?>(
        type = type,
        init = init,
    )
