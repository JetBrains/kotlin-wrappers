// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun PointerEvent(
    type: EventType<PointerEvent<EventTarget?>>,
): PointerEvent<*> =
    PointerEvent<EventTarget?>(
        type = type,
    )

inline fun PointerEvent(
    type: EventType<PointerEvent<EventTarget?>>,
    init: PointerEventInit,
): PointerEvent<*> =
    PointerEvent<EventTarget?>(
        type = type,
        init = init,
    )
