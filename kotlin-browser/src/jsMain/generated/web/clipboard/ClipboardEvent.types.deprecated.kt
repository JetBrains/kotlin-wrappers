// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.clipboard

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface ClipboardEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ClipboardEvent.copy()"),
    )
    @JsValue("copy")
    val COPY: EventType<ClipboardEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ClipboardEvent.cut()"),
    )
    @JsValue("cut")
    val CUT: EventType<ClipboardEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ClipboardEvent.paste()"),
    )
    @JsValue("paste")
    val PASTE: EventType<ClipboardEvent<EventTarget>>
        get() = definedExternally
}
