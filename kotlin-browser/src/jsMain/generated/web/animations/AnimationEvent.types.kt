// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external class AnimationEventTypes {

    @JsValue("animationcancel")
    val ANIMATION_CANCEL: EventType<AnimationEvent>

    @JsValue("animationend")
    val ANIMATION_END: EventType<AnimationEvent>

    @JsValue("animationiteration")
    val ANIMATION_ITERATION: EventType<AnimationEvent>

    @JsValue("animationstart")
    val ANIMATION_START: EventType<AnimationEvent>
}
