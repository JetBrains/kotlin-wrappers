// Automatically generated - do not modify!

package web.animations

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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

    @JsAlias(THIS)
    override fun asInit(): AnimationEventInit

    companion object {
        @JsValue("animationcancel")
        val ANIMATION_CANCEL: EventType<AnimationEvent>

        @JsValue("animationend")
        val ANIMATION_END: EventType<AnimationEvent>

        @JsValue("animationiteration")
        val ANIMATION_ITERATION: EventType<AnimationEvent>

        @JsValue("animationstart")
        val ANIMATION_START: EventType<AnimationEvent>
    }
}
