// Automatically generated - do not modify!

package web.animations

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
     * The **`AnimationEvent.elapsedTime`** read-only property is a float giving the amount of time the animation has been running, in seconds, when this event fired, excluding any time the animation was paused. For an animationstart event, elapsedTime is 0.0 unless there was a negative value for animation-delay, in which case the event will be fired with elapsedTime containing (-1 * delay).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/elapsedTime)
     */
    val elapsedTime: Double

    /**
     * The **`AnimationEvent.pseudoElement`** read-only property is a string, starting with '::', containing the name of the pseudo-element the animation runs on. If the animation doesn't run on a pseudo-element but on the element, an empty string: ''.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/pseudoElement)
     */
    val pseudoElement: String

    companion object
}

inline val AnimationEvent.Companion.ANIMATION_CANCEL: EventType<AnimationEvent>
    get() = EventType("animationcancel")

inline val AnimationEvent.Companion.ANIMATION_END: EventType<AnimationEvent>
    get() = EventType("animationend")

inline val AnimationEvent.Companion.ANIMATION_ITERATION: EventType<AnimationEvent>
    get() = EventType("animationiteration")

inline val AnimationEvent.Companion.ANIMATION_START: EventType<AnimationEvent>
    get() = EventType("animationstart")
