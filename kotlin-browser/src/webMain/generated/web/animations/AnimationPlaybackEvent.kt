// Automatically generated - do not modify!

package web.animations

import web.cssom.CSSNumberish
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`AnimationPlaybackEvent`** interface of the Web Animations API represents animation events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent)
 */
open external class AnimationPlaybackEvent(
    override val type: EventType<AnimationPlaybackEvent>,
    init: AnimationPlaybackEventInit = definedExternally,
) : Event {
    /**
     * The **`currentTime`** read-only property of the AnimationPlaybackEvent interface represents the current time of the animation that generated the event at the moment the event is queued. This will be unresolved if the animation was idle at the time the event was generated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/currentTime)
     */
    val currentTime: CSSNumberish?

    /**
     * The **`timelineTime`** read-only property of the AnimationPlaybackEvent interface represents the time value of the animation's timeline at the moment the event is queued. This will be unresolved if the animation was not associated with a timeline at the time the event was generated or if the associated timeline was inactive.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/timelineTime)
     */
    val timelineTime: CSSNumberish?

    companion object
}

inline val AnimationPlaybackEvent.Companion.CANCEL: EventType<AnimationPlaybackEvent>
    get() = EventType("cancel")

inline val AnimationPlaybackEvent.Companion.FINISH: EventType<AnimationPlaybackEvent>
    get() = EventType("finish")

inline val AnimationPlaybackEvent.Companion.REMOVE: EventType<AnimationPlaybackEvent>
    get() = EventType("remove")
