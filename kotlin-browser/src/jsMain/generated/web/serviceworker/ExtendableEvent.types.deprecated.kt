// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external interface ExtendableEventTypes {
    @JsValue("activate")
    val ACTIVATE: EventType<ExtendableEvent<*>>
        get() = definedExternally

    @JsValue("install")
    val INSTALL: EventType<ExtendableEvent<*>>
        get() = definedExternally
}
