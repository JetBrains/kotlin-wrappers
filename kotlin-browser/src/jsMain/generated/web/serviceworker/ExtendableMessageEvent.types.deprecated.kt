// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class ExtendableMessageEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ExtendableMessageEvent.MESSAGE"),
    )
    @JsValue("message")
    fun message(): EventType<ExtendableMessageEvent>
}
