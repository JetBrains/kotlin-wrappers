// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.gamepad

import web.events.EventTarget
import web.events.EventType

inline fun GamepadEvent(
    type: EventType<GamepadEvent<*>>,
    init: GamepadEventInit,
): GamepadEvent<*> =
    GamepadEvent<EventTarget?>(
        type = type,
        init = init,
    )
