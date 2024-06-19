// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class AnimationPlaybackEventTypes {

    @JsValue("cancel")
    fun <C : EventTarget> cancel(): EventType<AnimationPlaybackEvent, C>

    @JsValue("finish")
    fun <C : EventTarget> finish(): EventType<AnimationPlaybackEvent, C>

    @JsValue("remove")
    fun <C : EventTarget> remove(): EventType<AnimationPlaybackEvent, C>
}
