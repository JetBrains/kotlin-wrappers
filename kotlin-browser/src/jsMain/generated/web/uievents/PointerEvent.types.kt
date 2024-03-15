// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PointerEventTypes {

    @JsValue("gotpointercapture")
    fun <C : EventTarget> gotPointerCapture(): EventType<PointerEvent, C>

    @JsValue("lostpointercapture")
    fun <C : EventTarget> lostPointerCapture(): EventType<PointerEvent, C>

    @JsValue("pointercancel")
    fun <C : EventTarget> pointerCancel(): EventType<PointerEvent, C>

    @JsValue("pointerdown")
    fun <C : EventTarget> pointerDown(): EventType<PointerEvent, C>

    @JsValue("pointerenter")
    fun <C : EventTarget> pointerEnter(): EventType<PointerEvent, C>

    @JsValue("pointerleave")
    fun <C : EventTarget> pointerLeave(): EventType<PointerEvent, C>

    @JsValue("pointermove")
    fun <C : EventTarget> pointerMove(): EventType<PointerEvent, C>

    @JsValue("pointerout")
    fun <C : EventTarget> pointerOut(): EventType<PointerEvent, C>

    @JsValue("pointerover")
    fun <C : EventTarget> pointerOver(): EventType<PointerEvent, C>

    @JsValue("pointerup")
    fun <C : EventTarget> pointerUp(): EventType<PointerEvent, C>
}
