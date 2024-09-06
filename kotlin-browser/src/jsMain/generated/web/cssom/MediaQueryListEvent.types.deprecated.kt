// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import web.events.EventType

sealed external class MediaQueryListEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MediaQueryListEvent.CHANGE"),
    )
    @JsValue("change")
    fun change(): EventType<MediaQueryListEvent>
}
