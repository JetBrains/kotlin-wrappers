// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class TouchEventTypes {

    @JsValue("touchcancel")
    fun <C : EventTarget> touchCancel(): EventType<TouchEvent, C>

    @JsValue("touchend")
    fun <C : EventTarget> touchEnd(): EventType<TouchEvent, C>

    @JsValue("touchmove")
    fun <C : EventTarget> touchMove(): EventType<TouchEvent, C>

    @JsValue("touchstart")
    fun <C : EventTarget> touchStart(): EventType<TouchEvent, C>
}
