// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface PointerEventTypes {
    @JsValue("gotpointercapture")
    val GOT_POINTER_CAPTURE: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("lostpointercapture")
    val LOST_POINTER_CAPTURE: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointercancel")
    val POINTER_CANCEL: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointerdown")
    val POINTER_DOWN: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointerenter")
    val POINTER_ENTER: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointerleave")
    val POINTER_LEAVE: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointermove")
    val POINTER_MOVE: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointerout")
    val POINTER_OUT: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointerover")
    val POINTER_OVER: EventType<PointerEvent>
        get() = definedExternally

    @JsValue("pointerup")
    val POINTER_UP: EventType<PointerEvent>
        get() = definedExternally
}
