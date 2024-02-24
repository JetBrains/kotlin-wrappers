// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.animations

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events providing information related to animations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent)
 */
open external class AnimationEvent<out C : EventTarget?>(
    override val type: EventType<AnimationEvent<C>>,
    init: AnimationEventInit = definedExternally,
) : Event<C>,
    AnimationEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/animationName)
     */
    override val animationName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/elapsedTime)
     */
    override val elapsedTime: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/pseudoElement)
     */
    override val pseudoElement: String

    companion object : AnimationEventTypes
}
