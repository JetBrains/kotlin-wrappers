// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import web.events.EventType

sealed external interface MediaEncryptedEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("MediaEncryptedEvent.encrypted()"),
    )
    @JsValue("encrypted")
    val ENCRYPTED: EventType<MediaEncryptedEvent<*>>
        get() = definedExternally
}
