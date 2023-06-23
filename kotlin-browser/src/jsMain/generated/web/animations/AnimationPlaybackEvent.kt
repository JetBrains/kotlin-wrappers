// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.animations

import web.events.Event
import web.events.EventInit
import web.events.EventType

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent) */
external interface AnimationPlaybackEventInit : EventInit {
    var currentTime: CSSNumberish?
    var timelineTime: CSSNumberish?
}

open external class AnimationPlaybackEvent(
    override val type: EventType<AnimationPlaybackEvent>,
    init: AnimationPlaybackEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/currentTime) */
    val currentTime: CSSNumberish?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/timelineTime) */
    val timelineTime: CSSNumberish?

    companion object
}
