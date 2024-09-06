// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class FocusEventTypes_deprecated {

    @JsValue("blur")
    fun blur(): EventType<FocusEvent>

    @JsValue("focus")
    fun focus(): EventType<FocusEvent>

    @JsValue("focusin")
    fun focusIn(): EventType<FocusEvent>

    @JsValue("focusout")
    fun focusOut(): EventType<FocusEvent>
}
