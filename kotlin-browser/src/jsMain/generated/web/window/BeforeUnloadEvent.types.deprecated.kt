// Automatically generated - do not modify!

package web.window

import seskar.js.JsValue
import web.events.EventType

sealed external class BeforeUnloadEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("BeforeUnloadEvent.BEFORE_UNLOAD"),
    )
    @JsValue("beforeunload")
    fun beforeUnload(): EventType<BeforeUnloadEvent>
}
