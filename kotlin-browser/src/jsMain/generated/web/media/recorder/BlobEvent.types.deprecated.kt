// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.media.recorder

import seskar.js.JsValue
import web.events.EventType

sealed external interface BlobEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("BlobEvent.dataAvailable()"),
    )
    @JsValue("dataavailable")
    val DATA_AVAILABLE: EventType<BlobEvent<*>>
        get() = definedExternally
}
