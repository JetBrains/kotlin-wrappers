// Automatically generated - do not modify!

package web.push

import seskar.js.JsValue
import web.events.EventType

sealed external class PushEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PushEvent.PUSH"),
    )
    @JsValue("push")
    fun push(): EventType<PushEvent>
}
