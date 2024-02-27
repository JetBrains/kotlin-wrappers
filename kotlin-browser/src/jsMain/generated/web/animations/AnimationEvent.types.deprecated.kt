// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external interface AnimationEventTypes_deprecated {
    @JsValue("animationcancel")
    val ANIMATION_CANCEL: EventType<AnimationEvent<*>>
        get() = definedExternally

    @JsValue("animationend")
    val ANIMATION_END: EventType<AnimationEvent<*>>
        get() = definedExternally

    @JsValue("animationiteration")
    val ANIMATION_ITERATION: EventType<AnimationEvent<*>>
        get() = definedExternally

    @JsValue("animationstart")
    val ANIMATION_START: EventType<AnimationEvent<*>>
        get() = definedExternally
}
