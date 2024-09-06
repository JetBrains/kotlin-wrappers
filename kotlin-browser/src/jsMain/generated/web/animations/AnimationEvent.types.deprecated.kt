// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import web.events.EventType

sealed external class AnimationEventTypes_deprecated {

    @JsValue("animationcancel")
    fun animationCancel(): EventType<AnimationEvent>

    @JsValue("animationend")
    fun animationEnd(): EventType<AnimationEvent>

    @JsValue("animationiteration")
    fun animationIteration(): EventType<AnimationEvent>

    @JsValue("animationstart")
    fun animationStart(): EventType<AnimationEvent>
}
