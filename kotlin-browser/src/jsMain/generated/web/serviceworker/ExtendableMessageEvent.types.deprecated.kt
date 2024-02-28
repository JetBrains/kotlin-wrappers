// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external interface ExtendableMessageEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ExtendableMessageEvent.message()"),
    )
    @JsValue("message")
    val MESSAGE: EventType<ExtendableMessageEvent<*>>
        get() = definedExternally
}
