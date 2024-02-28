// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external interface AnimationEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationEvent.animationCancel()"),
    )
    @JsValue("animationcancel")
    val ANIMATION_CANCEL: EventType<AnimationEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationEvent.animationEnd()"),
    )
    @JsValue("animationend")
    val ANIMATION_END: EventType<AnimationEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationEvent.animationIteration()"),
    )
    @JsValue("animationiteration")
    val ANIMATION_ITERATION: EventType<AnimationEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationEvent.animationStart()"),
    )
    @JsValue("animationstart")
    val ANIMATION_START: EventType<AnimationEvent<*>>
        get() = definedExternally
}
