// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.animations

import web.events.EventTarget
import web.events.EventType

inline fun AnimationPlaybackEvent(
    type: EventType<AnimationPlaybackEvent<EventTarget>>,
): AnimationPlaybackEvent<*> =
    AnimationPlaybackEvent<EventTarget?>(
        type = type,
    )

inline fun AnimationPlaybackEvent(
    type: EventType<AnimationPlaybackEvent<EventTarget>>,
    init: AnimationPlaybackEventInit,
): AnimationPlaybackEvent<*> =
    AnimationPlaybackEvent<EventTarget?>(
        type = type,
        init = init,
    )
