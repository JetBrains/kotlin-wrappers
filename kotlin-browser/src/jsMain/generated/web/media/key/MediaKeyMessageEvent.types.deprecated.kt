// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.media.key

import seskar.js.JsValue
import web.events.EventType

sealed external interface MediaKeyMessageEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MediaKeyMessageEvent.message()"),
    )
    @JsValue("message")
    val MESSAGE: EventType<MediaKeyMessageEvent<*>>
        get() = definedExternally
}
