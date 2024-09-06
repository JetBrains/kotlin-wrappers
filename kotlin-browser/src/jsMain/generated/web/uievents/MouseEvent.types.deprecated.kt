// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class MouseEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.AUX_CLICK"),
    )
    @JsValue("auxclick")
    fun auxClick(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.CLICK"),
    )
    @JsValue("click")
    fun click(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.CONTEXT_MENU"),
    )
    @JsValue("contextmenu")
    fun contextMenu(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.DBL_CLICK"),
    )
    @JsValue("dblclick")
    fun dblClick(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_DOWN"),
    )
    @JsValue("mousedown")
    fun mouseDown(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_ENTER"),
    )
    @JsValue("mouseenter")
    fun mouseEnter(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_LEAVE"),
    )
    @JsValue("mouseleave")
    fun mouseLeave(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_MOVE"),
    )
    @JsValue("mousemove")
    fun mouseMove(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_OUT"),
    )
    @JsValue("mouseout")
    fun mouseOut(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_OVER"),
    )
    @JsValue("mouseover")
    fun mouseOver(): EventType<MouseEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MouseEvent.MOUSE_UP"),
    )
    @JsValue("mouseup")
    fun mouseUp(): EventType<MouseEvent>
}
