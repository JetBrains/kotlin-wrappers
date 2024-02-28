// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.promise

import seskar.js.JsValue
import web.events.EventType

sealed external interface PromiseRejectionEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PromiseRejectionEvent.rejectionHandled()"),
    )
    @JsValue("rejectionhandled")
    val REJECTION_HANDLED: EventType<PromiseRejectionEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PromiseRejectionEvent.unhandledRejection()"),
    )
    @JsValue("unhandledrejection")
    val UNHANDLED_REJECTION: EventType<PromiseRejectionEvent<*>>
        get() = definedExternally
}
