// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.errors

import seskar.js.JsValue
import web.events.EventType

sealed external interface ErrorEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ErrorEvent.error()"),
    )
    @JsValue("error")
    val ERROR: EventType<ErrorEvent<*>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ErrorEvent.processorError()"),
    )
    @JsValue("processorerror")
    val PROCESSOR_ERROR: EventType<ErrorEvent<*>>
        get() = definedExternally
}
