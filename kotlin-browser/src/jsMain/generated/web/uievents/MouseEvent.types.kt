// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MouseEventTypes {

    @JsValue("auxclick")
    fun <C : EventTarget> auxClick(): EventType<MouseEvent<C>>

    @JsValue("click")
    fun <C : EventTarget> click(): EventType<MouseEvent<C>>

    @JsValue("contextmenu")
    fun <C : EventTarget> contextMenu(): EventType<MouseEvent<C>>

    @JsValue("dblclick")
    fun <C : EventTarget> dblClick(): EventType<MouseEvent<C>>

    @JsValue("mousedown")
    fun <C : EventTarget> mouseDown(): EventType<MouseEvent<C>>

    @JsValue("mouseenter")
    fun <C : EventTarget> mouseEnter(): EventType<MouseEvent<C>>

    @JsValue("mouseleave")
    fun <C : EventTarget> mouseLeave(): EventType<MouseEvent<C>>

    @JsValue("mousemove")
    fun <C : EventTarget> mouseMove(): EventType<MouseEvent<C>>

    @JsValue("mouseout")
    fun <C : EventTarget> mouseOut(): EventType<MouseEvent<C>>

    @JsValue("mouseover")
    fun <C : EventTarget> mouseOver(): EventType<MouseEvent<C>>

    @JsValue("mouseup")
    fun <C : EventTarget> mouseUp(): EventType<MouseEvent<C>>
}
