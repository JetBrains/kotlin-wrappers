// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.animations

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * Events providing information related to animations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent)
 */
open external class AnimationEvent(
    override val type: EventType<AnimationEvent>,
    init: AnimationEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/animationName)
     */
    val animationName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/elapsedTime)
     */
    val elapsedTime: Double

    /**
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
