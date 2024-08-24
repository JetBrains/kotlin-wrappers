// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external class AnimationPlaybackEventTypes {

    @JsValue("cancel")
    fun cancel(): EventType<AnimationPlaybackEvent>

    @JsValue("finish")
    fun finish(): EventType<AnimationPlaybackEvent>

    @JsValue("remove")
    fun remove(): EventType<AnimationPlaybackEvent>
}
