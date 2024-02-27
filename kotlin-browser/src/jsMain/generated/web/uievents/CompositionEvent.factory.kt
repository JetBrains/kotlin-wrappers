// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun CompositionEvent(
    type: EventType<CompositionEvent<*>>,
): CompositionEvent<*> =
    CompositionEvent<EventTarget?>(
        type = type,
    )

inline fun CompositionEvent(
    type: EventType<CompositionEvent<*>>,
    init: CompositionEventInit,
): CompositionEvent<*> =
    CompositionEvent<EventTarget?>(
        type = type,
        init = init,
    )