// Automatically generated - do not modify!

package web.clipboard

import seskar.js.JsValue
import web.events.EventType

sealed external class ClipboardEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ClipboardEvent.COPY"),
    )
    @JsValue("copy")
    fun copy(): EventType<ClipboardEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ClipboardEvent.CUT"),
    )
    @JsValue("cut")
    fun cut(): EventType<ClipboardEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ClipboardEvent.PASTE"),
    )
    @JsValue("paste")
    fun paste(): EventType<ClipboardEvent>
}
