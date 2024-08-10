// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class FocusEventTypes {

    @JsValue("blur")
    fun <C : EventTarget> blur(): EventType<FocusEvent, C>

    @JsValue("focus")
    fun <C : EventTarget> focus(): EventType<FocusEvent, C>

    @JsValue("focusin")
    fun <C : EventTarget> focusIn(): EventType<FocusEvent, C>

    @JsValue("focusout")
    fun <C : EventTarget> focusOut(): EventType<FocusEvent, C>
}
