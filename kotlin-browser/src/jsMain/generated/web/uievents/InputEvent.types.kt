// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class InputEventTypes :
    InputEventTypes_deprecated {

    @JsValue("beforeinput")
    fun <C : EventTarget> beforeInput(): EventType<InputEvent<C>>
}
