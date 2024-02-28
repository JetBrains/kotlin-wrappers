// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.serviceworker

import web.events.EventTarget
import web.events.EventType

inline fun FetchEvent(
    type: EventType<FetchEvent<EventTarget?>>,
    init: FetchEventInit,
): FetchEvent<*> =
    FetchEvent<EventTarget?>(
        type = type,
        init = init,
    )
