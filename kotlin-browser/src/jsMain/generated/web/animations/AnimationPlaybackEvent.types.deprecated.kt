// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external interface AnimationPlaybackEventTypes {
    @JsValue("cancel")
    val CANCEL: EventType<AnimationPlaybackEvent<*>>
        get() = definedExternally

    @JsValue("finish")
    val FINISH: EventType<AnimationPlaybackEvent<*>>
        get() = definedExternally

    @JsValue("remove")
    val REMOVE: EventType<AnimationPlaybackEvent<*>>
        get() = definedExternally
}
