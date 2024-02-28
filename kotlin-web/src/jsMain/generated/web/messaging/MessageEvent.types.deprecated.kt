// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.messaging

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface MessageEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MessageEvent.connect()"),
    )
    @JsValue("connect")
    val CONNECT: EventType<MessageEvent<*, EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MessageEvent.message()"),
    )
    @JsValue("message")
    val MESSAGE: EventType<MessageEvent<*, EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MessageEvent.messageError()"),
    )
    @JsValue("messageerror")
    val MESSAGE_ERROR: EventType<MessageEvent<*, EventTarget>>
        get() = definedExternally
}
