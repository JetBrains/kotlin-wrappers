// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external class AnimationPlaybackEventTypes :
    AnimationPlaybackEventTypes_deprecated {

    @JsValue("cancel")
    val CANCEL: EventType<AnimationPlaybackEvent>

    @JsValue("finish")
    val FINISH: EventType<AnimationPlaybackEvent>

    @JsValue("remove")
    val REMOVE: EventType<AnimationPlaybackEvent>
}
