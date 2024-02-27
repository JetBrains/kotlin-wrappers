// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface MouseEventTypes {
    @JsValue("auxclick")
    val AUX_CLICK: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("click")
    val CLICK: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("contextmenu")
    val CONTEXT_MENU: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("dblclick")
    val DBL_CLICK: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mousedown")
    val MOUSE_DOWN: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mouseenter")
    val MOUSE_ENTER: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mouseleave")
    val MOUSE_LEAVE: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mousemove")
    val MOUSE_MOVE: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mouseout")
    val MOUSE_OUT: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mouseover")
    val MOUSE_OVER: EventType<MouseEvent<*>>
        get() = definedExternally

    @JsValue("mouseup")
    val MOUSE_UP: EventType<MouseEvent<*>>
        get() = definedExternally
}
