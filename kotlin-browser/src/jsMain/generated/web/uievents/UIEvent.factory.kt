// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun UIEvent(
    type: EventType<UIEvent<EventTarget>>,
): UIEvent<*> =
    UIEvent<EventTarget?>(
        type = type,
    )

inline fun UIEvent(
    type: EventType<UIEvent<EventTarget>>,
    init: UIEventInit,
): UIEvent<*> =
    UIEvent<EventTarget?>(
        type = type,
        init = init,
    )
