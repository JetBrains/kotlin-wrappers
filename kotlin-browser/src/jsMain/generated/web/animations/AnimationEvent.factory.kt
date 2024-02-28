// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.animations

import web.events.EventTarget
import web.events.EventType

inline fun AnimationEvent(
    type: EventType<AnimationEvent<EventTarget>>,
): AnimationEvent<*> =
    AnimationEvent<EventTarget?>(
        type = type,
    )

inline fun AnimationEvent(
    type: EventType<AnimationEvent<EventTarget>>,
    init: AnimationEventInit,
): AnimationEvent<*> =
    AnimationEvent<EventTarget?>(
        type = type,
        init = init,
    )
