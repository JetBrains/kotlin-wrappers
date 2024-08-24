// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class PointerEventTypes {

    @JsValue("gotpointercapture")
    fun gotPointerCapture(): EventType<PointerEvent>

    @JsValue("lostpointercapture")
    fun lostPointerCapture(): EventType<PointerEvent>

    @JsValue("pointercancel")
    fun pointerCancel(): EventType<PointerEvent>

    @JsValue("pointerdown")
    fun pointerDown(): EventType<PointerEvent>

    @JsValue("pointerenter")
    fun pointerEnter(): EventType<PointerEvent>

    @JsValue("pointerleave")
    fun pointerLeave(): EventType<PointerEvent>

    @JsValue("pointermove")
    fun pointerMove(): EventType<PointerEvent>

    @JsValue("pointerout")
    fun pointerOut(): EventType<PointerEvent>

    @JsValue("pointerover")
    fun pointerOver(): EventType<PointerEvent>

    @JsValue("pointerup")
    fun pointerUp(): EventType<PointerEvent>
}
