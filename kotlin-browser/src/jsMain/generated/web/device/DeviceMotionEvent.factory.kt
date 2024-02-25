// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.device

import web.events.EventTarget
import web.events.EventType

inline fun DeviceMotionEvent(
    type: EventType<DeviceMotionEvent<*>>,
): DeviceMotionEvent<*> =
    DeviceMotionEvent<EventTarget?>(
        type = type,
    )

inline fun DeviceMotionEvent(
    type: EventType<DeviceMotionEvent<*>>,
    init: DeviceMotionEventInit,
): DeviceMotionEvent<*> =
    DeviceMotionEvent<EventTarget?>(
        type = type,
        init = init,
    )
