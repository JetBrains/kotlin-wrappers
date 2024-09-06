// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class ToggleEventTypes :
    ToggleEventTypes_deprecated {

    @JsValue("beforetoggle")
    val BEFORE_TOGGLE: EventType<ToggleEvent>

    @JsValue("toggle")
    val TOGGLE: EventType<ToggleEvent>
}
