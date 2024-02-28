// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface AnimationPlaybackEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationPlaybackEvent.cancel()"),
    )
    @JsValue("cancel")
    val CANCEL: EventType<AnimationPlaybackEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationPlaybackEvent.finish()"),
    )
    @JsValue("finish")
    val FINISH: EventType<AnimationPlaybackEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("AnimationPlaybackEvent.remove()"),
    )
    @JsValue("remove")
    val REMOVE: EventType<AnimationPlaybackEvent<EventTarget>>
        get() = definedExternally
}
