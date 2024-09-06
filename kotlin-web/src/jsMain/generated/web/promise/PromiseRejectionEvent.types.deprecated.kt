// Automatically generated - do not modify!

package web.promise

import seskar.js.JsValue
import web.events.EventType

sealed external class PromiseRejectionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PromiseRejectionEvent.REJECTION_HANDLED"),
    )
    @JsValue("rejectionhandled")
    fun rejectionHandled(): EventType<PromiseRejectionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PromiseRejectionEvent.UNHANDLED_REJECTION"),
    )
    @JsValue("unhandledrejection")
    fun unhandledRejection(): EventType<PromiseRejectionEvent>
}
