// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external class AnimationEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationEvent.ANIMATION_CANCEL"),
    )
    @JsValue("animationcancel")
    fun animationCancel(): EventType<AnimationEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationEvent.ANIMATION_END"),
    )
    @JsValue("animationend")
    fun animationEnd(): EventType<AnimationEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationEvent.ANIMATION_ITERATION"),
    )
    @JsValue("animationiteration")
    fun animationIteration(): EventType<AnimationEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationEvent.ANIMATION_START"),
    )
    @JsValue("animationstart")
    fun animationStart(): EventType<AnimationEvent>
}
