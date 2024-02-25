// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.history

import web.events.EventTarget
import web.events.EventType

inline fun PopStateEvent(
    type: EventType<PopStateEvent<*>>,
): PopStateEvent<*> =
    PopStateEvent<EventTarget?>(
        type = type,
    )

inline fun PopStateEvent(
    type: EventType<PopStateEvent<*>>,
    init: PopStateEventInit,
): PopStateEvent<*> =
    PopStateEvent<EventTarget?>(
        type = type,
        init = init,
    )
