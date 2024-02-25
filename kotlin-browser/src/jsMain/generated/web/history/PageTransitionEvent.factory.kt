// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.history

import web.events.EventTarget
import web.events.EventType

inline fun PageTransitionEvent(
    type: EventType<PageTransitionEvent<*>>,
): PageTransitionEvent<*> =
    PageTransitionEvent<EventTarget?>(
        type = type,
    )

inline fun PageTransitionEvent(
    type: EventType<PageTransitionEvent<*>>,
    init: PageTransitionEventInit,
): PageTransitionEvent<*> =
    PageTransitionEvent<EventTarget?>(
        type = type,
        init = init,
    )
