// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class ToggleEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ToggleEvent.BEFORE_TOGGLE"),
    )
    @JsValue("beforetoggle")
    fun beforeToggle(): EventType<ToggleEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ToggleEvent.TOGGLE"),
    )
    @JsValue("toggle")
    fun toggle(): EventType<ToggleEvent>
}
