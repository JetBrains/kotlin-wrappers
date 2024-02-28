// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface ExtendableEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ExtendableEvent.activate()"),
    )
    @JsValue("activate")
    val ACTIVATE: EventType<ExtendableEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("ExtendableEvent.install()"),
    )
    @JsValue("install")
    val INSTALL: EventType<ExtendableEvent<EventTarget>>
        get() = definedExternally
}
