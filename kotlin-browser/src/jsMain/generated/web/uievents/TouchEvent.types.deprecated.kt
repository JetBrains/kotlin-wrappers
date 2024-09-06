// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class TouchEventTypes_deprecated {

    @JsValue("touchcancel")
    fun touchCancel(): EventType<TouchEvent>

    @JsValue("touchend")
    fun touchEnd(): EventType<TouchEvent>

    @JsValue("touchmove")
    fun touchMove(): EventType<TouchEvent>

    @JsValue("touchstart")
    fun touchStart(): EventType<TouchEvent>
}
