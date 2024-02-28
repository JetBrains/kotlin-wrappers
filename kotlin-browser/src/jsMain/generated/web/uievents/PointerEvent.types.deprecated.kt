// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface PointerEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.gotPointerCapture()"),
    )
    @JsValue("gotpointercapture")
    val GOT_POINTER_CAPTURE: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.lostPointerCapture()"),
    )
    @JsValue("lostpointercapture")
    val LOST_POINTER_CAPTURE: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerCancel()"),
    )
    @JsValue("pointercancel")
    val POINTER_CANCEL: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerDown()"),
    )
    @JsValue("pointerdown")
    val POINTER_DOWN: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerEnter()"),
    )
    @JsValue("pointerenter")
    val POINTER_ENTER: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerLeave()"),
    )
    @JsValue("pointerleave")
    val POINTER_LEAVE: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerMove()"),
    )
    @JsValue("pointermove")
    val POINTER_MOVE: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerOut()"),
    )
    @JsValue("pointerout")
    val POINTER_OUT: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerOver()"),
    )
    @JsValue("pointerover")
    val POINTER_OVER: EventType<PointerEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PointerEvent.pointerUp()"),
    )
    @JsValue("pointerup")
    val POINTER_UP: EventType<PointerEvent<*>>
        get() = definedExternally
}
