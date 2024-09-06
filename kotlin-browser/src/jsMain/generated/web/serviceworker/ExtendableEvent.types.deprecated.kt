// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class ExtendableEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ExtendableEvent.ACTIVATE"),
    )
    @JsValue("activate")
    fun activate(): EventType<ExtendableEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ExtendableEvent.INSTALL"),
    )
    @JsValue("install")
    fun install(): EventType<ExtendableEvent>
}
