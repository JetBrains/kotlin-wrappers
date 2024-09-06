// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class TouchEventTypes :
    TouchEventTypes_deprecated {

    @JsValue("touchcancel")
    val TOUCH_CANCEL: EventType<TouchEvent>

    @JsValue("touchend")
    val TOUCH_END: EventType<TouchEvent>

    @JsValue("touchmove")
    val TOUCH_MOVE: EventType<TouchEvent>

    @JsValue("touchstart")
    val TOUCH_START: EventType<TouchEvent>
}
