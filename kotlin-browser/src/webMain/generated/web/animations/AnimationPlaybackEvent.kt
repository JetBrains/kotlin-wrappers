// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The AnimationPlaybackEvent interface of the Web Animations API represents animation events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent)
 */
open external class AnimationPlaybackEvent(
    override val type: EventType<AnimationPlaybackEvent>,
    init: AnimationPlaybackEventInit = definedExternally,
) : Event {
    /**
     * The **`currentTime`** read-only property of the AnimationPlaybackEvent interface represents the current time of the animation that generated the event at the moment the event is queued.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/currentTime)
     */
    val currentTime: CSSNumberish?

    /**
     * The **`timelineTime`** read-only property of the AnimationPlaybackEvent interface represents the time value of the animation's AnimationTimeline at the moment the event is queued.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationPlaybackEvent/timelineTime)
     */
    val timelineTime: CSSNumberish?

    companion object
}

inline fun AnimationPlaybackEvent.asInit(): AnimationPlaybackEventInit =
    unsafeCast(this)

inline val AnimationPlaybackEvent.Companion.CANCEL: EventType<AnimationPlaybackEvent>
    get() = EventType("cancel")

inline val AnimationPlaybackEvent.Companion.FINISH: EventType<AnimationPlaybackEvent>
    get() = EventType("finish")

inline val AnimationPlaybackEvent.Companion.REMOVE: EventType<AnimationPlaybackEvent>
    get() = EventType("remove")
