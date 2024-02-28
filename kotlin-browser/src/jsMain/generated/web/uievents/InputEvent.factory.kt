// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

inline fun InputEvent(
    type: EventType<InputEvent<EventTarget>>,
): InputEvent<*> =
    InputEvent<EventTarget?>(
        type = type,
    )

inline fun InputEvent(
    type: EventType<InputEvent<EventTarget>>,
    init: InputEventInit,
): InputEvent<*> =
    InputEvent<EventTarget?>(
        type = type,
        init = init,
    )
