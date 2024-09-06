// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class PointerEventTypes :
    PointerEventTypes_deprecated {

    @JsValue("gotpointercapture")
    val GOT_POINTER_CAPTURE: EventType<PointerEvent>

    @JsValue("lostpointercapture")
    val LOST_POINTER_CAPTURE: EventType<PointerEvent>

    @JsValue("pointercancel")
    val POINTER_CANCEL: EventType<PointerEvent>

    @JsValue("pointerdown")
    val POINTER_DOWN: EventType<PointerEvent>

    @JsValue("pointerenter")
    val POINTER_ENTER: EventType<PointerEvent>

    @JsValue("pointerleave")
    val POINTER_LEAVE: EventType<PointerEvent>

    @JsValue("pointermove")
    val POINTER_MOVE: EventType<PointerEvent>

    @JsValue("pointerout")
    val POINTER_OUT: EventType<PointerEvent>

    @JsValue("pointerover")
    val POINTER_OVER: EventType<PointerEvent>

    @JsValue("pointerup")
    val POINTER_UP: EventType<PointerEvent>
}
