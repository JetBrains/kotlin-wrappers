// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class ToggleEventTypes {

    @JsValue("beforetoggle")
    fun <C : EventTarget> beforeToggle(): EventType<ToggleEvent, C>

    @JsValue("toggle")
    fun <C : EventTarget> toggle(): EventType<ToggleEvent, C>
}
