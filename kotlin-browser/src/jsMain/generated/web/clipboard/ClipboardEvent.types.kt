// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.clipboard

import seskar.js.JsValue
import web.events.EventType

sealed external interface ClipboardEventTypes {
    @JsValue("copy")
    val COPY: EventType<ClipboardEvent>
        get() = definedExternally

    @JsValue("cut")
    val CUT: EventType<ClipboardEvent>
        get() = definedExternally

    @JsValue("paste")
    val PASTE: EventType<ClipboardEvent>
        get() = definedExternally
}
