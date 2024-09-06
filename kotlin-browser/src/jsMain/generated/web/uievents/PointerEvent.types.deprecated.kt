// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class PointerEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.GOT_POINTER_CAPTURE"),
    )
    @JsValue("gotpointercapture")
    fun gotPointerCapture(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.LOST_POINTER_CAPTURE"),
    )
    @JsValue("lostpointercapture")
    fun lostPointerCapture(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_CANCEL"),
    )
    @JsValue("pointercancel")
    fun pointerCancel(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_DOWN"),
    )
    @JsValue("pointerdown")
    fun pointerDown(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_ENTER"),
    )
    @JsValue("pointerenter")
    fun pointerEnter(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_LEAVE"),
    )
    @JsValue("pointerleave")
    fun pointerLeave(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_MOVE"),
    )
    @JsValue("pointermove")
    fun pointerMove(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_OUT"),
    )
    @JsValue("pointerout")
    fun pointerOut(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_OVER"),
    )
    @JsValue("pointerover")
    fun pointerOver(): EventType<PointerEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PointerEvent.POINTER_UP"),
    )
    @JsValue("pointerup")
    fun pointerUp(): EventType<PointerEvent>
}
