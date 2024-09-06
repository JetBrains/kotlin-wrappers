// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external class PopStateEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PopStateEvent.POP_STATE"),
    )
    @JsValue("popstate")
    fun popState(): EventType<PopStateEvent>
}
