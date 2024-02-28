// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface MouseEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.auxClick()"),
    )
    @JsValue("auxclick")
    val AUX_CLICK: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.click()"),
    )
    @JsValue("click")
    val CLICK: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.contextMenu()"),
    )
    @JsValue("contextmenu")
    val CONTEXT_MENU: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.dblClick()"),
    )
    @JsValue("dblclick")
    val DBL_CLICK: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseDown()"),
    )
    @JsValue("mousedown")
    val MOUSE_DOWN: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseEnter()"),
    )
    @JsValue("mouseenter")
    val MOUSE_ENTER: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseLeave()"),
    )
    @JsValue("mouseleave")
    val MOUSE_LEAVE: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseMove()"),
    )
    @JsValue("mousemove")
    val MOUSE_MOVE: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseOut()"),
    )
    @JsValue("mouseout")
    val MOUSE_OUT: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseOver()"),
    )
    @JsValue("mouseover")
    val MOUSE_OVER: EventType<MouseEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MouseEvent.mouseUp()"),
    )
    @JsValue("mouseup")
    val MOUSE_UP: EventType<MouseEvent<*>>
        get() = definedExternally
}
