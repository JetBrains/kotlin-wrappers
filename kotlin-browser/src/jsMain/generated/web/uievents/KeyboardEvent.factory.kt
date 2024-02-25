// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun KeyboardEvent(
    type: EventType<KeyboardEvent<*>>,
): KeyboardEvent<*> =
    KeyboardEvent<EventTarget?>(
        type = type,
    )

inline fun KeyboardEvent(
    type: EventType<KeyboardEvent<*>>,
    init: KeyboardEventInit,
): KeyboardEvent<*> =
    KeyboardEvent<EventTarget?>(
        type = type,
        init = init,
    )
