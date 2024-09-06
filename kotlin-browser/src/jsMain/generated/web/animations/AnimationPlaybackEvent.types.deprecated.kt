// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external class AnimationPlaybackEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationPlaybackEvent.CANCEL"),
    )
    @JsValue("cancel")
    fun cancel(): EventType<AnimationPlaybackEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationPlaybackEvent.FINISH"),
    )
    @JsValue("finish")
    fun finish(): EventType<AnimationPlaybackEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("AnimationPlaybackEvent.REMOVE"),
    )
    @JsValue("remove")
    fun remove(): EventType<AnimationPlaybackEvent>
}
