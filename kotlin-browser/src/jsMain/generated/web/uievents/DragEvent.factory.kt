// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun DragEvent(
    type: EventType<DragEvent<EventTarget?>>,
): DragEvent<*> =
    DragEvent<EventTarget?>(
        type = type,
    )

inline fun DragEvent(
    type: EventType<DragEvent<EventTarget?>>,
    init: DragEventInit,
): DragEvent<*> =
    DragEvent<EventTarget?>(
        type = type,
        init = init,
    )
