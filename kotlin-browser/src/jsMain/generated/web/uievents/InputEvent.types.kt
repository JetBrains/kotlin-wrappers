// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class InputEventTypes {

    @JsValue("beforeinput")
    fun <C : EventTarget> beforeInput(): EventType<InputEvent, C>

    @JsValue("input")
    fun <C : EventTarget> input(): EventType<InputEvent, C>
}
