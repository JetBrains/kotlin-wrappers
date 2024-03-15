// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class AnimationEventTypes {

    @JsValue("animationcancel")
    fun <C : EventTarget> animationCancel(): EventType<AnimationEvent, C>

    @JsValue("animationend")
    fun <C : EventTarget> animationEnd(): EventType<AnimationEvent, C>

    @JsValue("animationiteration")
    fun <C : EventTarget> animationIteration(): EventType<AnimationEvent, C>

    @JsValue("animationstart")
    fun <C : EventTarget> animationStart(): EventType<AnimationEvent, C>
}
