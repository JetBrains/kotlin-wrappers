// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.device

import web.events.EventTarget
import web.events.EventType

inline fun DeviceOrientationEvent(
    type: EventType<DeviceOrientationEvent<*>>,
): DeviceOrientationEvent<*> =
    DeviceOrientationEvent<EventTarget?>(
        type = type,
    )

inline fun DeviceOrientationEvent(
    type: EventType<DeviceOrientationEvent<*>>,
    init: DeviceOrientationEventInit,
): DeviceOrientationEvent<*> =
    DeviceOrientationEvent<EventTarget?>(
        type = type,
        init = init,
    )
