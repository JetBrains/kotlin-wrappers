// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.animations

import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent)
 */
open external class AnimationPlaybackEvent(
    override val type: EventType<AnimationPlaybackEvent>,
    init: AnimationPlaybackEventInit = definedExternally,
) : Event,
    AnimationPlaybackEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/currentTime)
     */
    override val currentTime: CSSNumberish?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/timelineTime)
     */
    override val timelineTime: CSSNumberish?

    companion object : AnimationPlaybackEventTypes
}
