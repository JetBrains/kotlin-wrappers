// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`AnimationEvent`** interface represents events providing information related to animations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent)
 */
open external class AnimationEvent(
    override val type: EventType<AnimationEvent>,
    init: AnimationEventInit = definedExternally,
) : Event {
    /**
     * The **`AnimationEvent.animationName`** read-only property is a string containing the value of the animation-name CSS property associated with the transition.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/animationName)
     */
    val animationName: String

    /**
     * The **`AnimationEvent.elapsedTime`** read-only property is a `float` giving the amount of time the animation has been running, in seconds, when this event fired, excluding any time the animation was paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/elapsedTime)
     */
    val elapsedTime: Double

    /**
     * The **`AnimationEvent.pseudoElement`** read-only property is a string, starting with `'::'`, containing the name of the pseudo-element the animation runs on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/pseudoElement)
     */
    val pseudoElement: String

    companion object
}

inline fun AnimationEvent.asInit(): AnimationEventInit =
    unsafeCast(this)

inline val AnimationEvent.Companion.ANIMATION_CANCEL: EventType<AnimationEvent>
    get() = EventType("animationcancel")

inline val AnimationEvent.Companion.ANIMATION_END: EventType<AnimationEvent>
    get() = EventType("animationend")

inline val AnimationEvent.Companion.ANIMATION_ITERATION: EventType<AnimationEvent>
    get() = EventType("animationiteration")

inline val AnimationEvent.Companion.ANIMATION_START: EventType<AnimationEvent>
    get() = EventType("animationstart")
